package org.lanqiao.mapper;

import org.lanqiao.entity.PayType;
import org.springframework.stereotype.Repository;

@Repository
public interface PayTypeMapper {
    int deleteByPrimaryKey(Integer payTypeId);

    int insert(PayType record);

    int insertSelective(PayType record);

    int selectByPrimaryKey(String payTypeName);

    int updateByPrimaryKeySelective(PayType record);

    int updateByPrimaryKey(PayType record);
}