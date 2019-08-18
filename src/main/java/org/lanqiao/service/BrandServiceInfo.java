package org.lanqiao.service;

import org.lanqiao.entity.Brand;
import org.lanqiao.mapper.BrandMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceInfo implements Brandservice {
    @Autowired
    BrandMapper brandMapper;
    @Override
    public List<Brand> getBrand() {
        List<Brand>  brands=brandMapper.getBrand();
        for (Brand br:brands) {
            System.out.println(br.getBradName());
        }
        return brandMapper.getBrand();
    }
}
