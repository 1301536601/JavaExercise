package com.example.springbootdemo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data

@ConfigurationProperties(prefix = "mycar") //需要结合MyConfig中的@EnableConfigurationProperties(Car.class)一起使用
public class Car {

    private String Name;
    private  Integer age;
}
