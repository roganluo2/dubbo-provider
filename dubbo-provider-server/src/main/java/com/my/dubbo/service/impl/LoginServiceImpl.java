package com.my.dubbo.service.impl;

import com.my.dubbo.service.LoginService;

public class LoginServiceImpl implements LoginService {
    public String login(String username, String password) {
        System.out.println(username + "登录成功");
        return "Dubbo " + username;
    }
}
