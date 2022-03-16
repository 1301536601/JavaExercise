package com.example.springbootdemo.controller;

import com.example.springbootdemo.Model.Car;
import com.example.springbootdemo.config.ImportDemo;
import com.example.springbootdemo.config.Person;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
@Slf4j
public class HomeController {

    ImportDemo importDemo;
    Car car;
    Person person;

    public HomeController(ImportDemo importDemo,Car car,Person person){
        this.importDemo=importDemo;
        this.car=car;
        this.person=person;
    }




    @GetMapping("sayHi")
    public String sayHi(){
        log.info("测试日志呀");
        System.out.println("你好呀");
        importDemo.getUser();
        return  "你好呀";
    }

    /*
    从配置文件中获取信息
     */
    @GetMapping("getCar")
    public Car getCar(){

        return  car;
    }

    @GetMapping("getPerson")
    public  Person getPerson(){
        return  person;
    }
}
