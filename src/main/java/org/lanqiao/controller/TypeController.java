package org.lanqiao.controller;

import org.lanqiao.entity.Type;
import org.lanqiao.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
