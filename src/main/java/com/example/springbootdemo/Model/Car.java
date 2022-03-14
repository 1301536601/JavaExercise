package com.example.springbootdemo.Model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
//@Component //加载到容器中
@ConfigurationProperties(prefix = "mycar")
public class Car {

    private String Name;
    private  Integer age;
}
