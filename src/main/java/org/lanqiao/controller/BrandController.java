package org.lanqiao.controller;

import org.lanqiao.entity.Brand;
import org.lanqiao.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @RequestMapping("/Brand/GetAllBrand")
    public List<Brand> getAllBrand(){
        return brandService.getAllBrand();
    }

    @RequestMapping("/Brand/FindBrand")
    public List<Brand> findBrand(String bradName){
        return brandService.findBrand(bradName);
    }

    @RequestMapping("/Brand/DeleteBrand")
    public int deleteBrand(int brandId){
        return brandService.deleteBrand(brandId);
    }

    @RequestMapping("/Brand/UpdateBrand")
    public int updateBrand(Brand brand){
        return brandService.updateBrand(brand);
    }
}
