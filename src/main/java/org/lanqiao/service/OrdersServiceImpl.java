package org.lanqiao.service;

import org.lanqiao.entity.OrderDetail;
import org.lanqiao.entity.Orders;
import org.lanqiao.mapper.OrderDetailMapper;
import org.lanqiao.mapper.OrdersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    OrdersMapper ordersMapper;
    @Autowired
    OrderDetailMapper orderDetailMapper;

    @Override
    public int CreateOrders(Orders orders) {
        ordersMapper.insert(orders);
        return ordersMapper.selectByPrimaryKey();
    }

    @Override
    public int CreateOrderDetail(List<OrderDetail> orderDetails) {
        for(OrderDetail temp: orderDetails){
            orderDetailMapper.insert(temp);
        }
        return 1;
    }


    @Override
    public Set<Orders> getUserOrders(Integer userId, String orderState) {

        if(orderState.equals("待付款") || orderState.equals("待收货")){
            String str = "等" +orderState;
            System.out.println(userId+"  "+str);
            return ordersMapper.getUserOrders(userId,str);
        }else {
            return ordersMapper.getUserOrders(userId,orderState);
        }
    }

    @Override
    public Set<Orders> getAllOrders(Integer userId) {
        return ordersMapper.getAllOrders(userId);
    }

    @Override
    public int deleteOrder(Integer orderid) {
        return ordersMapper.deleteByPrimaryKey(orderid);
    }

    @Override
    public int updateOrder(Orders orders) {
        return ordersMapper.updateByPrimaryKeySelective(orders);
    }
}
