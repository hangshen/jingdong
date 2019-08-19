package org.lanqiao.service;

import org.lanqiao.entity.Type;
import org.lanqiao.entity.Type;
import org.lanqiao.mapper.TypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {
    @Autowired
    TypeMapper typeMapper;

    @Override
    public Type checkType(Type type) {
        return typeMapper.checkType(type);
    }

    @Override
    public int insertType(Type type){
        return typeMapper.insertType(type);
    }

    @Override
    public List<Type> getAllType(){
        return typeMapper.getAllType();
    }

    @Override
    public List<Type> findType(String typeName){
        typeName = "%" + typeName + "%";
        return typeMapper.findType(typeName);
    }

    @Override
    public int deleteType(int typeId){
        return typeMapper.deleteType(typeId);
    }

    @Override
    public int updateType(Type type){
        return typeMapper.updateType(type);
    }
}
