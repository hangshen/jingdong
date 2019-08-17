package org.lanqiao.mapper;

import org.lanqiao.entity.Standards;
import org.springframework.stereotype.Repository;

@Repository
public interface StandardsMapper {
    int deleteByPrimaryKey(Integer stanId);

    int insert(Standards record);

    int insertSelective(Standards record);

    Standards selectByPrimaryKey(Integer stanId);

    int updateByPrimaryKeySelective(Standards record);

    int updateByPrimaryKey(Standards record);
}