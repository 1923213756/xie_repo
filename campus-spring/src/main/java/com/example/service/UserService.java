package com.example.service;

import com.example.entity.User;

public interface UserService {
    // 注册用户
    void register(User user);

    // 登录校验
    boolean login(String username, String rawPassword);
}