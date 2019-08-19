package org.lanqiao.service;

import org.lanqiao.entity.Brand;
import org.lanqiao.mapper.BrandMapper;
import org.lanqiao.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {
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

    @Override
    public Brand checkBrand(String bradName) {
        return brandMapper.checkBrand(bradName);
    }

    @Override
    public int insertBrand(String bradName){
        Brand brand = new Brand();
        brand.setBradName(bradName);
        return brandMapper.insertBrand(brand);
    }

}
