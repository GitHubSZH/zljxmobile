package com.zljx.mapper;

import com.zljx.verify.TOperation;
import com.zljx.verify.TOperationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TOperationMapper {
    long countByExample(TOperationExample example);

    int deleteByExample(TOperationExample example);

    int deleteByPrimaryKey(Long operationId);

    int insert(TOperation record);

    int insertSelective(TOperation record);

    List<TOperation> selectByExample(TOperationExample example);

    TOperation selectByPrimaryKey(Long operationId);

    int updateByExampleSelective(@Param("record") TOperation record, @Param("example") TOperationExample example);

    int updateByExample(@Param("record") TOperation record, @Param("example") TOperationExample example);

    int updateByPrimaryKeySelective(TOperation record);

    int updateByPrimaryKey(TOperation record);
}