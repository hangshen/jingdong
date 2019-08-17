package org.lanqiao.mapper;

import org.lanqiao.entity.ProDetail;
import org.springframework.stereotype.Repository;

@Repository
public interface ProDetailMapper {
    int deleteByPrimaryKey(Integer pdetailId);

    int insert(ProDetail record);

    int insertSelective(ProDetail record);

    ProDetail selectByPrimaryKey(Integer pdetailId);

    int updateByPrimaryKeySelective(ProDetail record);

    int updateByPrimaryKey(ProDetail record);
}