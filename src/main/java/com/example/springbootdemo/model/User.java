package com.example.springbootdemo.model;

import lombok.Data;

@Data
public class User {

//    public  User(){
//        System.out.println("Init is User");
//        this.userName = "hbx";
//    }
    private String userName;

    private  Integer age;

}
