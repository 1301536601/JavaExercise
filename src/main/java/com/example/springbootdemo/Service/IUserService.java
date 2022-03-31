package com.example.springbootdemo.Service;

import com.example.springbootdemo.entity.UserEntity;


public interface IUserService {
    void  printHi();

    UserEntity getUser();
}
