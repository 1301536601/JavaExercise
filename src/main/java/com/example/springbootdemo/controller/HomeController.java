package com.example.springbootdemo.controller;

import com.example.springbootdemo.config.ImportDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    ImportDemo importDemo;


    @GetMapping("sayHi")
    public String sayHi(){
        System.out.println("你好呀");
        importDemo.getUser();
        return  "你好呀";
    }
}
