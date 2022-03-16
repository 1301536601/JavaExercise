package com.example.springbootdemo.config;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/*
 yaml配置文件
 需要在配置文件中注入需要引入以下依赖包
   <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-configuration-processor</artifactId>
            <optional>true</optional>
  </dependency>
 */
@ConfigurationProperties(prefix = "person")
@Data
@ToString
@Component
public class Person {

    private String name;

    private Integer age;

    private String address;
}
