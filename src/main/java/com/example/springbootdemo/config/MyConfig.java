package com.example.springbootdemo.config;

import com.example.springbootdemo.Mdel.Cat;
import com.example.springbootdemo.Mdel.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//
public class MyConfig {

    //当容器中存在getCat属性后才注入
    @ConditionalOnMissingBean(name = "getCat")
    @Bean
    public User getUser(){
        User user =new User();
        user.setUserName("张三");
        user.setAge(11);
        return user;
    }

     @Bean
    public Cat getCat(){
        Cat cat =new Cat();
        cat.setAge(11);
        cat.setUserName("宠物信息");
        return cat;
    }
}
