package org.lanqiao.mapper;

import org.lanqiao.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    int insertUser(User user);

    int deleteUserById(Integer userId);

    int updateUser(User user,Integer userId);

    User selectByPhone(String account);
}