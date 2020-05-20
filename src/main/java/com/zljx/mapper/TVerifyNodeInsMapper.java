package com.zljx.mapper;

import com.zljx.verify.TVerifyNodeIns;
import com.zljx.verify.TVerifyNodeInsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TVerifyNodeInsMapper {
    long countByExample(TVerifyNodeInsExample example);

    int deleteByExample(TVerifyNodeInsExample example);

    int deleteByPrimaryKey(Long nodeInsId);

    int insert(TVerifyNodeIns record);

    int insertSelective(TVerifyNodeIns record);

    List<TVerifyNodeIns> selectByExample(TVerifyNodeInsExample example);

    TVerifyNodeIns selectByPrimaryKey(Long nodeInsId);

    int updateByExampleSelective(@Param("record") TVerifyNodeIns record, @Param("example") TVerifyNodeInsExample example);

    int updateByExample(@Param("record") TVerifyNodeIns record, @Param("example") TVerifyNodeInsExample example);

    int updateByPrimaryKeySelective(TVerifyNodeIns record);

    int updateByPrimaryKey(TVerifyNodeIns record);

    TVerifyNodeIns selectByTaskIdAndOperationId(@Param("operationId") Long operationId, @Param("taskId")Long taskId);
}