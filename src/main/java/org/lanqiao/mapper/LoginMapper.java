package org.lanqiao.mapper;

import org.lanqiao.entity.Login;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginMapper {
    int deleteLogin(Integer userId);
//
//    int insert(Login record);
//
//    int insertSelective(Login record);
//
//    Login selectByPrimaryKey(Integer loginId);
//
//    int updateByPrimaryKeySelective(Login record);
//
//    int updateByPrimaryKey(Login record);


    Login selectByAccount(String account);
    int insertLogin(Login login);

    int updatePassword(String oldPassword, String newPassword, String reNewPassword, String account);
}