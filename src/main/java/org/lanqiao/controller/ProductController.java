package org.lanqiao.controller;

import org.lanqiao.entity.Product;
import org.lanqiao.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
        @Autowired
        ProductService productService;
        @RequestMapping("/seleOnePro")
        public Product selectByPrimaryKey(Integer proId){
            return  productService.selectByPrimaryKey(proId);
        }
            @RequestMapping("/seleAllPro")
        public List<Product> selectByAll(Integer proId) {
            return productService.selectByAll(proId);
        }
    @RequestMapping("/insertPro")
    public int insert(@RequestBody Product record){
        return productService.insert(record);
    }
}
