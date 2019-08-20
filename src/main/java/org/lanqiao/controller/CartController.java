package org.lanqiao.controller;

import org.lanqiao.entity.Cart;
import org.lanqiao.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CartController {
    @Autowired
    CartService cartService;

    @RequestMapping("/del")
    public Integer getProDel(Integer cartId){

        return cartService.getProDel(cartId);
    }
    @RequestMapping("/add")
    public Integer getProAdd(@RequestBody List<Cart> cartId){
        for (Cart ct:cartId) {
            ct.getCarProNum();
        }
        return cartService.getProAdd(cartId);
    }

    @RequestMapping("/Cart/GetCartInformation")
    public List<Cart> getCartInformation(int userId){return cartService.GetCartInformation(userId);}

    @RequestMapping("/insertToCart")
    public int insert(@RequestBody Cart record){
        return cartService.insert(record);
    }

    @RequestMapping("/get/all/cart")
    public List<Cart> getAllCar(Integer userId){
        System.out.println(userId);
        return cartService.getAllCart(userId);
    }
}
