package org.lanqiao.service;

import org.lanqiao.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserService {
    User selectByPhone(String account);
    int insertUser(User user);
    int deleteUseById(int id);
    int updateUser(User user, Integer userId);
}
