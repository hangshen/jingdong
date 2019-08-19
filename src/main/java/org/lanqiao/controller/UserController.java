package org.lanqiao.controller;


import org.lanqiao.entity.Login;
import org.lanqiao.entity.User;
import org.lanqiao.service.LoginService;
import org.lanqiao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.plaf.synth.SynthUI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController

public class UserController {

    @Autowired
    UserService userService;
    @Autowired
    LoginService loginService;

    @RequestMapping("/registerNum")
    public Map registerNum(String phone) {
        User user = userService.selectByPhone(phone);
        Map map = new HashMap();
        map.put("user", user);
        map.put("phone", phone);
        return map;
    }


    @RequestMapping("/addUser")
    public int insertUser(User user, String account, String password) {
        System.out.println(user+" "+ account+" "+ password);
        user.setPhone(account);
        int flag = userService.insertUser(user);

        if (flag == 1) {
            System.out.println(1);
            User u = userService.selectByPhone(account);
            System.out.println(2);
            loginService.insertLogin(account, password, u.getUserId());
            return flag;
        } else {
            return 0;
        }

    }
    @RequestMapping("deleteUserById")
    public int deleteUserById(Integer userId) {
        int flag = userService.deleteUserById(userId);
        if(flag==1){
            return loginService.deleteLogin(userId);
        }else{
            return 0;
        }

    }

    public int updateUser(User user, String account) {
        Login login=loginService.selectByAccount(account);
        return userService.updateUser(user,login.getLoginId());
    }

    @RequestMapping("/getAllUser")
    public List<User> getAllUser(){
//        for(User u:  userService.getAllUser()){
//            System.out.println(u.getUserId()+","+u.getUserName());
//        }
        System.out.println(1);
        return userService.getAllUser();
    }
}
