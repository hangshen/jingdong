package org.lanqiao.service;

import org.lanqiao.entity.Product;
import org.lanqiao.entity.Shop;
import org.lanqiao.mapper.ShopMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopServiceInfo implements Shopservice {
    @Autowired
    ShopMapper shopMapper;
    @Override
    public List<Shop> findProduct(String produce){
        produce=new StringBuilder().append("%").append(produce).append("%").toString();

        return shopMapper.findProduct(produce);
    }

    @Override
    public int findId(String pname){
        return shopMapper.findId(pname);
    }


}
