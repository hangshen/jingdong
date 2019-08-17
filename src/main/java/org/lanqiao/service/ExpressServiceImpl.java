package org.lanqiao.service;

import org.lanqiao.entity.Express;
import org.lanqiao.mapper.ExpressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpressServiceImpl implements ExpressService{
    @Autowired
    ExpressMapper expressMapper;

    @Override
    public List<String> getExpress(){return expressMapper.selectByPrimaryKey();}
}
