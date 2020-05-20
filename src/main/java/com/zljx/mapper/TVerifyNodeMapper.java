package com.zljx.mapper;

import com.zljx.verify.TVerifyNode;
import com.zljx.verify.TVerifyNodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TVerifyNodeMapper {
    long countByExample(TVerifyNodeExample example);

    int deleteByExample(TVerifyNodeExample example);

    int deleteByPrimaryKey(Long nodeId);

    int insert(TVerifyNode record);

    int insertSelective(TVerifyNode record);

    List<TVerifyNode> selectByExample(TVerifyNodeExample example);

    TVerifyNode selectByPrimaryKey(Long nodeId);

    int updateByExampleSelective(@Param("record") TVerifyNode record, @Param("example") TVerifyNodeExample example);

    int updateByExample(@Param("record") TVerifyNode record, @Param("example") TVerifyNodeExample example);

    int updateByPrimaryKeySelective(TVerifyNode record);

    int updateByPrimaryKey(TVerifyNode record);

    List<TVerifyNode> selectByFlowId(Long verifyFlowId);
}