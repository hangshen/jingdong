package org.lanqiao.mapper;

import org.lanqiao.entity.OrderDetail;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailMapper {
    int deleteByPrimaryKey(Integer orDeId);

    int insert(OrderDetail orderDetail);

    int insertSelective(OrderDetail record);

    OrderDetail selectByPrimaryKey(Integer orDeId);

    int updateByPrimaryKeySelective(OrderDetail record);

    int updateByPrimaryKey(OrderDetail record);
}