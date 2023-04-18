package com.example.myfirstweb.service;

public interface UserService {
    void show();

    void transferMoney(String initAccount, String outAccount, Integer money);
}
