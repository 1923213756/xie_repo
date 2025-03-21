package com.example;

import com.example.config.AppConfig;
import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);

        // 注册测试
        User user = new User();
        user.setUsername("testUser");
        user.setPassword("123456");
        user.setUserType(0);
        userService.register(user);
        System.out.println("注册成功！");

        // 登录测试
        boolean result = userService.login("testUser", "123456");
        System.out.println("登录结果：" + result); // 应为 true
    }
}