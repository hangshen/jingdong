package org.lanqiao.service;

import org.lanqiao.entity.Type;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TypeService {
    Type checkType(Type type);
    List<Type> getAllType();
    List<Type> findType(String typeName);
    int insertType(Type type);
    int deleteType(int typeId);
    int updateType(Type type);
}
