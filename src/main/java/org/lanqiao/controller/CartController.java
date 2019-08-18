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
        return cartService.getProAdd(cartId);
    }

    @RequestMapping("/Cart/GetCartInformation")
    public List<Cart> getCartInformation(int userId){return cartService.GetCartInformation(userId);}
}
