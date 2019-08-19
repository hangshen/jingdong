package org.lanqiao.mapper;

import org.lanqiao.entity.Type;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TypeMapper {
    Type checkType(Type type);
    List<Type> getAllType();
    List<Type> findType(String typeName);
    int insertType(Type type);
    int deleteType(int typeId);
    int updateType(Type type);
}