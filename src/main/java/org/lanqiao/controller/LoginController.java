package org.lanqiao.controller;


import org.lanqiao.entity.Login;
import org.lanqiao.entity.User;
import org.lanqiao.service.LoginServiceImpl;
import org.lanqiao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {

    @Autowired
    LoginServiceImpl loginService;

    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public Map login(String account, String password, HttpSession session) {
        Login login = loginService.selectByAccount(account);
        User user = userService.selectByPhone(account);
        if (login != null && password.equals(login.getPassword())) {
            //session()保存account
//            session.setAttribute("account", account);
//            return (String) session.getAttribute("account");
            Map map = new HashMap();
            map.put("userId",user.getUserId());
            map.put("userName",user.getUserName());
            return map;
        } else {
            return null;
        }
    }

    @RequestMapping("/updatePassword")
    public int updatePassword(String oldPassword,String newPassword,String reNewPassword,String account){
        return loginService.updatePassword(oldPassword,newPassword,reNewPassword,account);
    }
}
