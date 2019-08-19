package org.lanqiao.mapper;

import org.apache.ibatis.annotations.Param;
import org.lanqiao.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductMapper {
    int deleteByPrimaryKey(Integer proId);

    int insert(Product record);


    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    Product selectByPrimaryKey(Integer proId);

    List<Product> selectByAll(Integer proId);

    List<Product> selByName(String selName);
}