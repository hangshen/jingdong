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

    public List<Orders> getUserOrders(Integer userId, String orderState,Integer pageNum,Integer pageSize);

    List<Orders> getAllOrders(Integer userId,Integer pageNum,Integer pageSize);

    public int deleteOrder(Integer orderid);

    public  int updateOrder(Orders orders);
}
