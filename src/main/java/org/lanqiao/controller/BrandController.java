package org.lanqiao.controller;

import org.lanqiao.entity.Brand;
import org.lanqiao.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BrandController {
    @Autowired
    BrandService brandService;

    @RequestMapping("/Brand/CheckBrandName")
    public Integer checkBrand(String bradName){
        Brand brand = brandService.checkBrand(bradName);
        if(brand.getBrandId() == null){
            return 0;
        }else{
            return 1;
        }
    }

    @RequestMapping("/Brand/InsertBrand")
    public int insertBrand(String bradName){
        return brandService.insertBrand(bradName);
    }
}
