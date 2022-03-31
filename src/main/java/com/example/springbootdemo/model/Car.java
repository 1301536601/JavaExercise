package com.example.springbootdemo.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data

@ConfigurationProperties(prefix = "mycar") //需要结合MyConfig中的@EnableConfigurationProperties(Car.class)一起使用
public class Car {

    private String Name;
    private  Integer age;
}
