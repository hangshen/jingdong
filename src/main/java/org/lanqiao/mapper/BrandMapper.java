package org.lanqiao.mapper;

import org.lanqiao.entity.Brand;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BrandMapper {
    List<Brand> getBrand();
    Brand checkBrand(String bradName);
    List<Brand> getAllBrand();
    List<Brand> findBrand(String bradName);
    int insertBrand(Brand brand);
    int deleteBrand(int brandId);
    int updateBrand(Brand brand);
}