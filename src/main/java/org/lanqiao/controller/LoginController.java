package org.lanqiao.controller;


import org.lanqiao.entity.Login;
import org.lanqiao.service.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class LoginController {

    @Autowired
    LoginServiceImpl loginService;

    @RequestMapping("/login")
    public String login(String account, String password, HttpSession session) {
        Login login = loginService.selectByAccount(account);

        if (login != null && password.equals(login.getPassword())) {
            //session()保存account
            session.setAttribute("account", account);
            return (String) session.getAttribute("account");
        } else {
            return null;
        }
    }

    @RequestMapping("/updatePassword")
    public int updatePassword(String oldPassword,String newPassword,String reNewPassword,String account){
        return loginService.updatePassword(oldPassword,newPassword,reNewPassword,account);
    }
}
