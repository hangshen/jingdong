package org.lanqiao.service;

import org.lanqiao.entity.User;
import org.lanqiao.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User selectByPhone(String phone) {

        return userMapper.selectByPhone(phone);
    }

    @Override
    public int updateUser(User user, Integer userId) {
        return userMapper.updateUser(user,userId);
    }

    @Override
    public int insertUser(User user) {
        System.out.println(user);
        return userMapper.insertUser(user);
    }


    @Override
    public int deleteUseById(int id) {
        return userMapper.deleteUserById(id);
    }

}