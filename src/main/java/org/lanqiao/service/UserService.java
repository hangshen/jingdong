package org.lanqiao.service;

import org.lanqiao.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserService {
    User selectByPhone(String account);
    int insertUser(User user);
    int deleteUserById(int id);
    int updateUser(User user, Integer userId);
    List<User> getAllUser();
}
