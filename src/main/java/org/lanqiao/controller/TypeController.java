package org.lanqiao.controller;

import org.lanqiao.entity.Type;
import org.lanqiao.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TypeController {
    @Autowired
    TypeService typeService;

    @RequestMapping("/Type/CheckTypeName")
    public Type checkType(Type type){
        return typeService.checkType(type);
    }

    @RequestMapping("/Type/InsertType")
    public int insertType(Type type){return typeService.insertType(type);}

    @RequestMapping("/Type/GetAllType")
    public List<Type> getAllType(){
        return typeService.getAllType();
    }

    @RequestMapping("/Type/FindType")
    public List<Type> findType(String typeName){
        return typeService.findType(typeName);
    }

    @RequestMapping("/Type/DeleteType")
    public int deleteType(int typeId){
        return typeService.deleteType(typeId);
    }

    @RequestMapping("/Type/UpdateType")
    public int updateType(Type type){
        return typeService.updateType(type);
    }
}
