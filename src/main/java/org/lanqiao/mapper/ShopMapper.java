package org.lanqiao.mapper;

import org.lanqiao.entity.Shop;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShopMapper {
    List<Shop> findProduct(String produce);
    List<Shop> findId(String pname);
}