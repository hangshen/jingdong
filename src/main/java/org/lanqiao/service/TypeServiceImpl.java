package org.lanqiao.service;

import org.lanqiao.entity.Type;
import org.lanqiao.mapper.TypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TypeServiceImpl implements TypeService {
    @Autowired
    TypeMapper typeMapper;

    @Override
    public Type checkType(Type type){
        return typeMapper.checkType(type);
    }

    @Override
    public int insertType(Type type){
        return typeMapper.insertType(type);
    }
}
