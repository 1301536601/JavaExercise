package com.example.springbootdemo.Model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
//@Component //直接使用当前注解也可以加载到容器中从而读取配置信息
@ConfigurationProperties(prefix = "mycar") //需要结合MyConfig中的@EnableConfigurationProperties(Car.class)一起使用
public class Car {

    private String Name;
    private  Integer age;
}
