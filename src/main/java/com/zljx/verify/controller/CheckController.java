package com.zljx.verify.controller;

import com.zljx.mapper.TTaskMapper;
import com.zljx.mapper.TVerifyFlowInsMapper;
import com.zljx.mapper.TVerifyNodeInsMapper;
import com.zljx.verify.TTask;
import com.zljx.verify.TVerifyFlowIns;
import com.zljx.verify.TVerifyNodeIns;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author: sunzhihan
 * @Date：2020/03/11 14:16
 * @Version 1.0
 **/
@RestController
@RequestMapping("/check/")
public class CheckController {


    @Autowired
    private TTaskMapper tTaskMapper;

    @Autowired
    private TVerifyNodeInsMapper tVerifyNodeInsMapper;

    @Autowired
    private TVerifyFlowInsMapper tVerifyFlowInsMapper;


    /**
     * @describe  未审核列表
     * @params [operationId, appId]
     * @return java.util.List<java.util.Map<java.lang.String,java.lang.Object>>
     */
        @RequestMapping("/noyWayCheck")
    public List<Map<String,Object>>   noyWayCheck(Long operationId,Long appId){
        List<Map<String,Object>> list = tTaskMapper.selectNoyWayCheck(operationId,appId);
        return list;
    }

    /**
     * @describe  审核成功列表
     * @params [operationId, appId]
     * @return java.util.List<java.util.Map<java.lang.String,java.lang.Object>>
     */
        @RequestMapping("/succeedCheck")
    public List<Map<String,Object>>   succeedCheck(Long operationId,Long appId){
        List<Map<String,Object>> list = tTaskMapper.succeedCheck(operationId,appId);
        return list;
    }

    /**
     * @describe  拒绝审核
     * @params [operationId, appId]
     * @return java.util.List<java.util.Map<java.lang.String,java.lang.Object>>
     */
        @RequestMapping("/downCheck")
    public String  downCheck(Long operationId,Long taskId,String json){
            TVerifyNodeIns nodeIns = tVerifyNodeInsMapper.selectByTaskIdAndOperationId(operationId,taskId);
            if(nodeIns==null){
                return "该用户无权审核！";
            }
            nodeIns.setIsVerify((byte)1);
            nodeIns.setVerifyTime(new Date());


            TVerifyFlowIns flowIns =  tVerifyFlowInsMapper.selectByTaskId(taskId);
            flowIns.setVerifyStatus((byte)4);
            flowIns.setLastVerifyId(operationId);
            flowIns.setRefuseReason(json);
            flowIns.setLastVerifyTime(new Date());
            tVerifyNodeInsMapper.updateByPrimaryKeySelective(nodeIns);
            tVerifyFlowInsMapper.updateByPrimaryKeySelective(flowIns);

            TTask tTask = new TTask();
            tTask.setTaskId(taskId);
            //3.驳回
            tTask.setStauts((byte)3);
            tTaskMapper.updateByPrimaryKeySelective(tTask);
            return "success";
    }


    @RequestMapping("/checkGO")
    @Transactional
    public String  checkGO(Long operationId,Long appId,Long taskId){

        TVerifyNodeIns nodeIns = tVerifyNodeInsMapper.selectByTaskIdAndOperationId(operationId,taskId);

        if(nodeIns==null){
            return "该用户无权审核通过！";
        }
        // 0未审核  1是审核了
        nodeIns.setIsVerify((byte)1);
        nodeIns.setVerifyTime(new Date());

        String result = "";

       TVerifyFlowIns flowIns =  tVerifyFlowInsMapper.selectByTaskId(taskId);
        Long nextInsNode = nodeIns.getNextInsNode();
        if(nextInsNode!=null && nextInsNode>0){
            flowIns.setNextId(nextInsNode);
            result = "operationId="+operationId+"审核通过了！";;
        }else{
            flowIns.setNextId(-1L);
            //2是审核通过
            flowIns.setVerifyStatus((byte)2);

            result = "全部审核通过了！！！";
        }
        flowIns.setLastVerifyId(operationId);
        flowIns.setLastVerifyTime(new Date());
        tVerifyNodeInsMapper.updateByPrimaryKeySelective(nodeIns);
        tVerifyFlowInsMapper.updateByPrimaryKeySelective(flowIns);

        return result;
    }


}
