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
    public List<Cart> GetCartInformation(int userId) {
        return cartMapper.selectByPrimaryKey(userId);
    }
}
