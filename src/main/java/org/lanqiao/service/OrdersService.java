package org.lanqiao.service;

import org.lanqiao.entity.OrderDetail;
import org.lanqiao.entity.Orders;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface OrdersService {
    public int CreateOrders(Orders orders);

    public int CreateOrderDetail(List<OrderDetail> orderDetails);

    public Set<Orders> getUserOrders(Integer userId, String orderState);

    Set<Orders> getAllOrders(Integer userId);

    public int deleteOrder(Integer orderid);

    public  int updateOrder(Orders orders);
}
