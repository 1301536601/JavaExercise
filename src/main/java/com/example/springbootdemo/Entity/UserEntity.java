package com.example.springbootdemo.Entity;

import lombok.Data;

import java.sql.Date;

@Data
public class UserEntity {

    private String id;
    private String user_Name;
    private String password;
    private String name;
    private Integer age;
    private Integer sex;
    private Date birthday;
    private String created;
    private String updated;
}
