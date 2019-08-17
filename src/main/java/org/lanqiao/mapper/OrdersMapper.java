package org.lanqiao.mapper;

import org.apache.ibatis.annotations.Param;
import org.lanqiao.entity.Orders;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface OrdersMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(Orders orders);

    int insertSelective(Orders orders);

    int selectByPrimaryKey();

    int updateByPrimaryKeySelective(Orders orders);

    int updateByPrimaryKey(Orders record);

    Set<Orders> getUserOrders(@Param("userId")Integer userId, @Param("orderState")String orderState);

    Set<Orders> getAllOrders(Integer userId);
}