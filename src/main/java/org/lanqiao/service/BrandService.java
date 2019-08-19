package org.lanqiao.service;

import org.lanqiao.entity.Brand;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BrandService {
    List<Brand> getBrand();
    Brand checkBrand(String bradName);
    int insertBrand(String bradName);
}
