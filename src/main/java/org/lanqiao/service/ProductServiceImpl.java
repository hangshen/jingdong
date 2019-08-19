package org.lanqiao.service;

import org.lanqiao.entity.Product;
import org.lanqiao.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    ProductMapper productMapper;
    @Override
    public Product selectByPrimaryKey(Integer proId){
        return  productMapper.selectByPrimaryKey(proId);
    }
    @Override
   public List<Product> selectByAll(Integer proId){
        return  productMapper.selectByAll(proId);
    }
    @Override
    public int insert(Product record){
        return productMapper.insert(record);
    }
    @Override
    public List<Product> selByName(String selName){
        return productMapper.selByName(selName);
    }
    @Override
    public int delPro(Integer proId){
        return productMapper.delPro(proId);
    }
}
