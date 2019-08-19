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

    @Override
    public List<Brand> getAllBrand(){
        return brandMapper.getAllBrand();
    }

    @Override
    public List<Brand> findBrand(String bradName){
//        int len = bradName.length();
//        bradName = bradName.substring(1, len - 1);
        bradName = "%" + bradName + "%";
        return brandMapper.findBrand(bradName);
    }

    @Override
    public int deleteBrand(int brandId){
        return brandMapper.deleteBrand(brandId);
    }

    @Override
    public int updateBrand(Brand brand){
        return brandMapper.updateBrand(brand);
    }
}
