package org.lanqiao.mapper;

import org.lanqiao.entity.Image;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageMapper {

    Image selectByPrimaryKey(Integer imageId);

}