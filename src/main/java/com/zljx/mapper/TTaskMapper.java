package com.zljx.mapper;

import com.zljx.verify.TTask;
import com.zljx.verify.TTaskExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface TTaskMapper {
    long countByExample(TTaskExample example);

    int deleteByExample(TTaskExample example);

    int deleteByPrimaryKey(Long taskId);

    int insert(TTask record);

    int insertSelective(TTask record);

    List<TTask> selectByExample(TTaskExample example);

    TTask selectByPrimaryKey(Long taskId);

    int updateByExampleSelective(@Param("record") TTask record, @Param("example") TTaskExample example);

    int updateByExample(@Param("record") TTask record, @Param("example") TTaskExample example);

    int updateByPrimaryKeySelective(TTask record);

    int updateByPrimaryKey(TTask record);

    /**
     * @describe  查看未审核列表
     * @params [operationId] 登陆者Id
     * @return java.util.List<java.util.Map<java.lang.String,java.lang.Object>>
     */
    List<Map<String, Object>> selectNoyWayCheck(@Param("operationId") Long operationId,@Param("appId")Long appId);

    /**
     * @describe  查看审核成功列表
     * @params [operationId] 登陆者Id
     * @return java.util.List<java.util.Map<java.lang.String,java.lang.Object>>
     */
    List<Map<String, Object>> succeedCheck(@Param("operationId") Long operationId,@Param("appId")Long appId);

}