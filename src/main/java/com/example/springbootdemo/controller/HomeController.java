package com.example.springbootdemo.controller;

import com.example.springbootdemo.Model.Car;
import com.example.springbootdemo.config.ImportDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    ImportDemo importDemo;
    @Autowired
    Car car;


    @GetMapping("sayHi")
    public String sayHi(){
        System.out.println("你好呀");
        importDemo.getUser();
        return  "你好呀";
    }

    @GetMapping("getCar")
    public Car getCar(){
        return  car;
    }
}
