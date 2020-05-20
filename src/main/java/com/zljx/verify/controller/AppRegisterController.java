package com.zljx.verify.controller;

import com.zljx.mapper.*;
import com.zljx.verify.*;
import javafx.concurrent.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.soap.Addressing;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: sunzhihan
 * @Date：2020/03/10 16:20
 * @Version 1.0
 **/
@RestController
@RequestMapping("/app/")
public class AppRegisterController {

    @Autowired
    private TAppConfigMapper tAppConfigMapper;

    @Autowired
    private TVerifyFlowMapper tVerifyFlowMapper;

    @Autowired
    private TVerifyNodeMapper tVerifyNodeMapper;


    @GetMapping("register")
    @Transactional
    public String appRegister(String appName,String desc,Long... ids){
        //直接创建应用 以及审核流程和审核节点咯
        TAppConfig appConfig = new TAppConfig();
        appConfig.setAppName(appName);
        appConfig.setDescription(desc);
        appConfig.setCreateTime(new Date());
        tAppConfigMapper.insertSelective(appConfig);

        //新建应用审核流程
        TVerifyFlow tVerifyFlow = new TVerifyFlow();
        tVerifyFlow.setAppId(appConfig.getAppId());
        tVerifyFlow.setCreateTime(new Date());
        tVerifyFlow.setVerifyType(Byte.valueOf("1"));//1是依次审批
        tVerifyFlowMapper.insertSelective(tVerifyFlow);
        Long verifyFlowId = tVerifyFlow.getVerifyFlowId();

        //新建应用审核流节点
        for(int i=0;i<=ids.length-1;i++){
            TVerifyNode tVerifyNode = new TVerifyNode();
            tVerifyNode.setFlowId(verifyFlowId);
            tVerifyNode.setFlowOrder((byte) i);
            tVerifyNode.setOperationId(ids[i]);
            tVerifyNodeMapper.insertSelective(tVerifyNode);
        }

        return "success";

    }

    @Autowired
    private TTaskMapper tTaskMapper;

    @Autowired
    private TVerifyFlowInsMapper tVerifyFlowInsMapper;

    @Autowired
    private TVerifyNodeInsMapper tVerifyNodeInsMapper;


    //提交审核
    @GetMapping("task")
    public String task(Long appId,String title,String context){

        //创建消息
        TTask tTask = new TTask();

        tTask.setAapId(appId);
        tTask.setTitle(title);
        tTask.setContext(context);
        //1是待审核
        tTask.setStauts((byte)1);
        //1是依次审批
        tTask.setVerifyType((byte)1);
        tTask.setCreateTime(new Date());
        tTaskMapper.insertSelective(tTask);


        /**
         * @describe
         *  创建应用app时，应用的图标，名称，平台类型，推送的url。之后还需要配置应用审核流程，选择应用以及推送的平台，默认的审批人，和抄送人，审批方式。
         *
         * 消息提交审核时，会记录标题，内容....，还有标签的覆盖的人数，这次消息发送预计发送的人数。推送的时间计划，推送的目标， 附加参数。
         * 然后创建消息的审核流程。 因为创建消息会选择在应用，所以根据应用id查询 应用审核流程表， 将审核的方式，抄送人，将审核状态设置待审核状态，入库到任务审核流程表，
         * 根据应用审核流程表id查询应用审核节点表，将配置到审核节点表中的人员id，入库到任务审核节点表中，和审核的顺序，设置为未审批，下一节点审批人。
         *
         *  在根据应用审核流程id去查询抄送人表，抄送人id，抄送人顺序，  在入库抄送人节点表，关联任务审核流程表id，抄送人id，抄送人顺序
         *
         *
         */

        //创建任务审批对应表
        TVerifyFlow tVerifyFlow =  tVerifyFlowMapper.selectByAppId(appId);
        TVerifyFlowIns flowIns = new TVerifyFlowIns();
        //1是待审核
        flowIns.setVerifyStatus((byte)1);
        //1是依次审批
        flowIns.setVerifyType((tVerifyFlow.getVerifyType()));
        flowIns.setTaskId(tTask.getTaskId());

        tVerifyFlowInsMapper.insertSelective(flowIns);


        //根据审核流程id去查询 审批节点表
       List<TVerifyNode> nodeList =  tVerifyNodeMapper.selectByFlowId(tVerifyFlow.getVerifyFlowId());
        System.out.println(nodeList);

        List<TVerifyNodeIns> tVerifyNodeInsList = new ArrayList<>(nodeList.size());

        for (int i=0;i<nodeList.size();i++){
            TVerifyNode tVerifyNode = nodeList.get(i);

            TVerifyNodeIns nodeIns = new TVerifyNodeIns();
            nodeIns.setFlowInsId(flowIns.getFlowInsId());
            nodeIns.setInsFlowOrder(tVerifyNode.getFlowOrder());
            //0是未审批
            nodeIns.setIsVerify((byte)0);
            if(tVerifyNodeInsList.size()>0){
                nodeIns.setNextInsNode( tVerifyNodeInsList.get(i-1).getNodeInsId());
            }
            nodeIns.setOperationId(tVerifyNode.getOperationId());

            tVerifyNodeInsList.add(nodeIns);
            tVerifyNodeInsMapper.insertSelective(nodeIns);
        }

        //Long nodeInsId = tVerifyNodeInsList.get(tVerifyNodeInsList.size() - 1).getNodeInsId();
        System.out.println(tVerifyNodeInsList);
        System.out.println("------------");
        System.out.println(tVerifyNodeInsList.get(tVerifyNodeInsList.size() - 1));
        flowIns.setNextId(tVerifyNodeInsList.get(tVerifyNodeInsList.size()-1).getNodeInsId());
        tVerifyFlowInsMapper.updateByPrimaryKey(flowIns);

        return "success";

    }

}
