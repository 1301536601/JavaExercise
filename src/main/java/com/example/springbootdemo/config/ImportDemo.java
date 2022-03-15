package com.example.springbootdemo.config;

import com.example.springbootdemo.Model.Cat;
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

    //使用ImportResource("classpath:appbeanconfig.xml") 不能带有构造函数
    User user;
    Cat cat;
    public  ImportDemo(User user,Cat cat){
        this.user=user;
        this.cat=cat;
    }

    @PostConstruct //todo 待补充
    public void init(){
        System.out.println("user:"+ this.user);
        System.out.println("cat:"+this.cat);
    }

    public void getUser(){

    }
}
