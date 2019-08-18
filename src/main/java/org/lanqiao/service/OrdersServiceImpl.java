package org.lanqiao.service;

import org.lanqiao.entity.OrderDetail;
import org.lanqiao.entity.Orders;
import org.lanqiao.mapper.ExpressMapper;
import org.lanqiao.mapper.OrderDetailMapper;
import org.lanqiao.mapper.OrdersMapper;
import org.lanqiao.mapper.PayTypeMapper;
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
    @Autowired
    ExpressMapper expressMapper;
    @Autowired
    PayTypeMapper payTypeMapper;

    @Override
    public int CreateOrders(Orders orders) {
        orders.setOrExpressTypeId(expressMapper.selectByPrimaryKey(orders.getOrExpressType()));
        orders.setPayTypeId(payTypeMapper.selectByPrimaryKey(orders.getPayType()));
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
    public List<Orders> getUserOrders(Integer userId, String orderState,Integer pageNum,Integer pageSize) {


        if(orderState.equals("待付款") || orderState.equals("待收货")){
            String str = "等" +orderState;
            List<Orders> orders=ordersMapper.getUserOrders(userId,str);
            int Size=orders.size();
            for (Orders or:orders) {
                if(Size%pageSize == 0){
                    or.setPageNum(Size/pageSize);
                }
                else{
                    or.setPageNum(Size/pageSize + 1);
                }
            }
            pageNum--;
            System.out.println((pageNum*pageSize)+" "+Size+"  "+(pageNum*pageSize+pageSize));
            if((pageNum*pageSize+pageSize) >=Size ){
                return orders.subList(pageNum*pageSize,Size);
            } else{
                return orders.subList(pageNum*pageSize,(pageNum*pageSize+pageSize));
            }
        }else {
            List<Orders> orders=ordersMapper.getUserOrders(userId,orderState);
            int Size=orders.size();
            for (Orders or:orders) {
                if(Size%pageSize == 0){
                    or.setPageNum(Size/pageSize);
                }
                else{
                    or.setPageNum(Size/pageSize + 1);
                }
            }
            pageNum--;
            System.out.println((pageNum*pageSize)+" "+Size+"  "+(pageNum*pageSize+pageSize));
            if((pageNum*pageSize+pageSize) >=Size ){
                return orders.subList(pageNum*pageSize,Size);
            } else{
                return orders.subList(pageNum*pageSize,(pageNum*pageSize+pageSize));
            }
        }
    }

    @Override
    public List<Orders> getAllOrders(Integer userId,Integer pageNum,Integer pageSize) {
        List<Orders> orders=ordersMapper.getAllOrders(userId);
        int Size=orders.size();
        for (Orders or:orders) {
            if(Size%pageSize == 0){
                or.setPageNum(Size/pageSize);
            }
            else{
                or.setPageNum(Size/pageSize + 1);
            }
        }
        pageNum--;
        System.out.println((pageNum*pageSize)+" "+Size+"  "+(pageNum*pageSize+pageSize));
        if((pageNum*pageSize+pageSize) >=Size ){
            return orders.subList(pageNum*pageSize,Size);
        } else{
            return orders.subList(pageNum*pageSize,(pageNum*pageSize+pageSize));
        }
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
