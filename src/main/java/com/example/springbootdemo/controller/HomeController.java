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

    ImportDemo importDemo;
    Car car;

    public HomeController(ImportDemo importDemo,Car car){
        this.importDemo=importDemo;
        this.car=car;
    }




    @GetMapping("sayHi")
    public String sayHi(){
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
}
