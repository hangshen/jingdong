package org.lanqiao.service;

import org.lanqiao.entity.Cart;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartService {
    public List<Cart> GetCartInformation(int userId);

    public Integer getProDel(Integer cartId);

    public Integer getProAdd(List<Cart> cartId);
}
