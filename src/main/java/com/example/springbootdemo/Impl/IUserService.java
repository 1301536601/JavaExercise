package com.example.springbootdemo.Impl;

import com.example.springbootdemo.Entity.UserEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


public interface IUserService {
    void  printHi();

    UserEntity getUser();
}
