package com.example.myfirstweb.service.impl;

import com.example.myfirstweb.mapper.AccountMapper;
import com.example.myfirstweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private AccountMapper accountMapper;
    public UserServiceImpl() {
        System.out.println("UserService instance created. ");
    }

    public void show() {
        System.out.println("User service's show get called");
    }

    @Override
    public void transferMoney(String initAccount, String outAccount, Integer money) {
        accountMapper.decrMoney(initAccount, money);
//        Integer i = 1/0;
        accountMapper.incrMoney(outAccount, money);
    }
}
