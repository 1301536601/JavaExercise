package com.example.springbootdemo.controller;

import com.example.springbootdemo.Model.Car;
import com.example.springbootdemo.Model.SwaggerRequest;
import com.example.springbootdemo.config.ImportDemo;
import com.example.springbootdemo.config.Person;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home")
@Slf4j
@Api(tags = "Home接口")
public class HomeController {

    ImportDemo importDemo;
    Car car;
    Person person;

    public HomeController(ImportDemo importDemo,Car car,Person person){
        this.importDemo=importDemo;
        this.car=car;
        this.person=person;
    }

    @ApiOperation(value = "测试接口",notes = "说你好")
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
    @ApiOperation(value = "从配置中获取信息",notes = "从配置中获取信息")
    @GetMapping("getCar")
    public Car getCar(){

        return  car;
    }

    @ApiOperation(value = "从配置中获取信息1",notes = "从配置中获取信息1")
    @GetMapping("getPerson")
    public  Person getPerson(){
        return  person;
    }

    @ApiOperation(value = "swagger配置",notes = "swagger配置")
    @PostMapping("swaggerRequest")
    public String SwaggerRequest(@RequestBody SwaggerRequest request){
        return "当前是swagger请求";
    }
}
