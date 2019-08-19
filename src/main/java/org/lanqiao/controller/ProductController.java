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
    @RequestMapping("/selByName")
    public List<Product> selByName(@RequestBody String selName){
            int len = selName.length();
            selName = selName.substring(1,len-1);
          selName = "%"+selName+"%";
          System.out.println(selName);
          return productService.selByName(selName);
    }
    @RequestMapping("/delPro")
    public int delPro(@RequestBody Integer proId){
            System.out.println(proId);
        return productService.delPro(proId);
    }
    @RequestMapping("/updatePro")
    public int updatePro(@RequestBody Product record){
        return productService.updatePro(record);
    }
}
