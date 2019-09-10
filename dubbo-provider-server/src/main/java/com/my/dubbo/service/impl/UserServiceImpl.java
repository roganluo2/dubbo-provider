package com.my.dubbo.service.impl;

import com.my.dubbo.service.UserService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class UserServiceImpl implements UserService {


    @Override
    public String sayHello(String name) {
        System.out.println("接收到请求");
        return "hello " + name;
    }
}
