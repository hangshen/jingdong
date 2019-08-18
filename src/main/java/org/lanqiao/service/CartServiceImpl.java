package org.lanqiao.service;

import org.lanqiao.entity.Cart;
import org.lanqiao.mapper.CartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    CartMapper cartMapper;

    @Override
    public Integer getProDel(Integer cartId) {
        return cartMapper.deleteByPrimaryKey(cartId);
    }

    @Override
    public Integer getProAdd(List<Cart> cartId) {
        for (Cart temp: cartId){
//            cartMapper.insert(temp);
            cartMapper.updateByPrimaryKeySelective(temp);
        }
        return 1;
    }

    @Override
    public List<Cart> GetCartInformation(int userId) {
        return cartMapper.selectByPrimaryKey(userId);
    }

    @Override
    public int insert(Cart record){
        return cartMapper.insert(record);
    }
}
