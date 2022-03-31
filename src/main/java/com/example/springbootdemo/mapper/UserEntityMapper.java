package com.example.springbootdemo.mapper;

import com.example.springbootdemo.Entity.UserEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


public interface UserEntityMapper {

    UserEntity queryUserById(@Param("id") long id);
}
