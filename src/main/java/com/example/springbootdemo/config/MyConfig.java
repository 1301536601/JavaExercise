package com.example.springbootdemo.config;

import com.example.springbootdemo.Model.Car;
import com.example.springbootdemo.Model.Cat;
import com.example.springbootdemo.Model.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
//@ImportResource("classpath:appbeanconfig.xml")
@EnableConfigurationProperties(Car.class)
public class MyConfig {

    @Bean
    public Cat getCat(){
        Cat cat =new Cat();
        cat.setAge(11);
        cat.setUserName("宠物信息");
        return cat;
    }

    //当容器中存在getCat属性后才注入
    @ConditionalOnBean(name = "getCat")
    @Bean
    public User getUser(){
        User user =new User();
        user.setUserName("张三");
        user.setAge(11);
        return user;
    }

    //当容器中存在getCat属性后才注入
    @ConditionalOnBean(name = "getCat")
    @Bean
    public User getUser1(){
        User user =new User();
        user.setUserName("张三1");
        user.setAge(111);
        return user;
    }
}
