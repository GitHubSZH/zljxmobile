package com.zljx.mapper;

import com.zljx.verify.TVerifyFlowIns;
import com.zljx.verify.TVerifyFlowInsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TVerifyFlowInsMapper {
    long countByExample(TVerifyFlowInsExample example);

    int deleteByExample(TVerifyFlowInsExample example);

    int deleteByPrimaryKey(Long flowInsId);

    int insert(TVerifyFlowIns record);

    int insertSelective(TVerifyFlowIns record);

    List<TVerifyFlowIns> selectByExample(TVerifyFlowInsExample example);

    TVerifyFlowIns selectByPrimaryKey(Long flowInsId);

    int updateByExampleSelective(@Param("record") TVerifyFlowIns record, @Param("example") TVerifyFlowInsExample example);

    int updateByExample(@Param("record") TVerifyFlowIns record, @Param("example") TVerifyFlowInsExample example);

    int updateByPrimaryKeySelective(TVerifyFlowIns record);

    int updateByPrimaryKey(TVerifyFlowIns record);

    TVerifyFlowIns selectByTaskId(Long taskId);
}