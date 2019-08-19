package org.lanqiao.service;

import org.lanqiao.entity.Type;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeService {
    Type checkType(Type type);
    int insertType(Type type);
}
