package com.zljx.mapper;

import com.zljx.verify.TAppConfig;
import com.zljx.verify.TAppConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAppConfigMapper {
    long countByExample(TAppConfigExample example);

    int deleteByExample(TAppConfigExample example);

    int deleteByPrimaryKey(Long appId);

    int insert(TAppConfig record);

    int insertSelective(TAppConfig record);

    List<TAppConfig> selectByExample(TAppConfigExample example);

    TAppConfig selectByPrimaryKey(Long appId);

    int updateByExampleSelective(@Param("record") TAppConfig record, @Param("example") TAppConfigExample example);

    int updateByExample(@Param("record") TAppConfig record, @Param("example") TAppConfigExample example);

    int updateByPrimaryKeySelective(TAppConfig record);

    int updateByPrimaryKey(TAppConfig record);
}