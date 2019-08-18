package org.lanqiao.mapper;

import org.apache.ibatis.annotations.Param;
import org.lanqiao.entity.Orders;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface OrdersMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(Orders orders);

    int insertSelective(Orders orders);

    int selectByPrimaryKey();

    int updateByPrimaryKeySelective(Orders orders);

    int updateByPrimaryKey(Orders record);

    List<Orders> getUserOrders(@Param("userId")Integer userId, @Param("orderState")String orderState);

    List<Orders> getAllOrders(Integer userId);
}