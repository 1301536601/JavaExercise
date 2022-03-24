package com.example.springbootdemo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j //添加日志
@ToString //生成ToString方法
@AllArgsConstructor// 生成所有参数的构造器
//@NoArgsConstructor //生成无参构造器
//@Component //直接使用当前注解也可以加载到容器中从而读取配置信息
public class LombokDemo {

    private String name;

    private Integer age;
}
