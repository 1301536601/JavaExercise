package com.example.springbootdemo.config;

import com.example.springbootdemo.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/*
    Import注解Demo
    自动创建出User的实例，
 */
@Import({User.class})
@Service
public class ImportDemo {
    //因为注入了多个类型一样的bean 所以需要在使用的时候需要指定使用那个bean
    @Resource(name = "com.example.springbootdemo.Model.User")
    User user;

    @PostConstruct
    public void init(){
        System.out.println("user:"+ this.user);
    }

    public void getUser(){
//todo 待补充
    }
}
