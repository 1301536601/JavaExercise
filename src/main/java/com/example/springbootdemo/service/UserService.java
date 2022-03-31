package com.example.springbootdemo.service;

import com.example.springbootdemo.AopDemo.MetricTime;
import com.example.springbootdemo.Entity.UserEntity;
import com.example.springbootdemo.Impl.IUserService;
import com.example.springbootdemo.mapper.UserEntityMapper;
import lombok.var;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    UserEntityMapper userEntityMapper;


    public UserService(UserEntityMapper userEntityMapper) {
        this.userEntityMapper = userEntityMapper;
    }

    @Override
    @MetricTime("printHi")
    public void printHi() {
        System.out.println("你好呀");
    }

    @Override
    public UserEntity getUser() {
        var result=userEntityMapper.queryUserById(1);
        return result;
    }
}
