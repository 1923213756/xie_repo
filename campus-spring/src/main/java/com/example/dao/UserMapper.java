package com.example.dao;


import com.example.entity.User;

public interface UserMapper {
    // 插入用户
    int insertUser(User user);

    // 根据用户名查询（用于登录校验）
    User selectByUsername(String username);
}