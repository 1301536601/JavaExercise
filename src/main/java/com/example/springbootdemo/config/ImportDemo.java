package com.example.springbootdemo.config;

import com.example.springbootdemo.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/*
    Import注解Demo
    自动创建出User的实例，
 */
@Import({User.class})
@Service
public class ImportDemo {

    User user;
    public  ImportDemo(User user){
        this.user=user;
    }

    @PostConstruct
    public void init(){
        System.out.println("user:"+ this.user);
    }

    public void getUser(){
//todo 待补充
    }
}
