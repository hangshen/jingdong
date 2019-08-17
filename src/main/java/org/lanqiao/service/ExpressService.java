package org.lanqiao.service;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExpressService {
    public List<String> getExpress();
}
