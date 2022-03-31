package com.example.springbootdemo.service;

import com.example.springbootdemo.AopDemo.MetricTime;
import com.example.springbootdemo.Impl.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Override
    @MetricTime("printHi")
    public void printHi() {
        System.out.println("你好呀");
    }
}
