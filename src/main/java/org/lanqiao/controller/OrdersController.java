package org.lanqiao.controller;

import org.lanqiao.entity.OrderDetail;
import org.lanqiao.entity.Orders;
import org.lanqiao.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;


@RestController
public class OrdersController {
    @Autowired
    OrdersService ordersService;

    @RequestMapping("/Orders/CreateOrders")
    public int CreateOrders(@RequestBody Orders orders){
        return ordersService.CreateOrders(orders);
    }

    @RequestMapping("/Orders/CreateOrdersDetail")
    public int CreateOrderDetail(@RequestBody List<OrderDetail> orderDetails){
        return ordersService.CreateOrderDetail(orderDetails);
    }

    @RequestMapping("/get/user/state/order")
    public Set<Orders> getUserOrders(int userId, String orderState)
    {
        return ordersService.getUserOrders(userId,orderState);
    }

    @RequestMapping("/get/user/all/order")
    public Set<Orders> getAllOrders(int userId){
        return ordersService.getAllOrders(userId);
    }

    @RequestMapping("delete/user/order")
    public int deleteOrder(int orderId){
        return ordersService.deleteOrder(orderId);
    }

    @RequestMapping("update/order")
    public int updateOrder(Orders orders){
        System.out.println("ooookkkk"+orders.getOrderState());
        if(orders.getOrderState().equals("等待付款")){
            orders.setOrderState("已取消");
        } else if ( orders.getOrderState().equals("等待收货")){
            orders.setOrderState("已完成");
        }
        System.out.println(orders.getOrderState());
        return ordersService.updateOrder(orders);
    }
}
