package org.lanqiao.mapper;

import org.lanqiao.entity.Express;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExpressMapper {
    int deleteByPrimaryKey(Integer expressId);

    int insert(Express record);

    int insertSelective(Express record);

    List<String> selectByPrimaryKey();

    int updateByPrimaryKeySelective(Express record);

    int updateByPrimaryKey(Express record);
}