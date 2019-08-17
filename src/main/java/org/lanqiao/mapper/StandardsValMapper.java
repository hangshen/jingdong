package org.lanqiao.mapper;

import org.lanqiao.entity.StandardsVal;
import org.springframework.stereotype.Repository;

@Repository
public interface StandardsValMapper {
    int deleteByPrimaryKey(Integer stanValId);

    int insert(StandardsVal record);

    int insertSelective(StandardsVal record);

    StandardsVal selectByPrimaryKey(Integer stanValId);

    int updateByPrimaryKeySelective(StandardsVal record);

    int updateByPrimaryKey(StandardsVal record);
}