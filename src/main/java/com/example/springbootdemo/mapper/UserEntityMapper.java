package com.example.springbootdemo.mapper;

import com.example.springbootdemo.entity.UserEntity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserEntityMapper {

    UserEntity queryUserById(@Param("id") long id);
}
