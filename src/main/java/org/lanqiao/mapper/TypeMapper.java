package org.lanqiao.mapper;

import org.lanqiao.entity.Type;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeMapper {
    int deleteByPrimaryKey(Integer typeId);

    int insertType(Type type);

    int insertSelective(Type record);

    Type checkType(Type type);

    int updateByPrimaryKeySelective(Type record);

    int updateByPrimaryKey(Type record);
}