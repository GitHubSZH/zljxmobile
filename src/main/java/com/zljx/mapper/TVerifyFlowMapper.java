package com.zljx.mapper;

import com.zljx.verify.TVerifyFlow;
import com.zljx.verify.TVerifyFlowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TVerifyFlowMapper {
    long countByExample(TVerifyFlowExample example);

    int deleteByExample(TVerifyFlowExample example);

    int deleteByPrimaryKey(Long verifyFlowId);

    int insert(TVerifyFlow record);

    int insertSelective(TVerifyFlow record);

    List<TVerifyFlow> selectByExample(TVerifyFlowExample example);

    TVerifyFlow selectByPrimaryKey(Long verifyFlowId);

    int updateByExampleSelective(@Param("record") TVerifyFlow record, @Param("example") TVerifyFlowExample example);

    int updateByExample(@Param("record") TVerifyFlow record, @Param("example") TVerifyFlowExample example);

    int updateByPrimaryKeySelective(TVerifyFlow record);

    int updateByPrimaryKey(TVerifyFlow record);

    TVerifyFlow selectByAppId(Long appId);
}