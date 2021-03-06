package com.example.springbootdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
标识当前为启动类，并且为springboot应用
*/
//scanBasePackages = "com" 设置包扫描的初始位置
@SpringBootApplication()
@MapperScan("com.example.springbootdemo.mapper")
public class SpringBootDemoApplication {

    public static void main(String[] args)  {
        ApplicationContext run=SpringApplication.run(SpringBootDemoApplication.class, args);
        String[] beanNames=run.getBeanDefinitionNames();
//        System.out.println("所有bean的名称");
//        System.out.println("******************");
//        User user=run.getBean("getUser",User.class);
//        System.out.println(user);
//        System.out.println("**********");
//        Cat cat =run.getBean("getCat",Cat.class);
//        System.out.println(cat);
        System.out.println("获取使用Conditional获取的Bean信息");
        Boolean user=  run.containsBean("getUser");
        System.out.println(user);

        Boolean cat=run.containsBean("getCat");
        System.out.println(cat);

        //需要需要MyConfig的ImportResource
        Boolean hehe=run.containsBean("hehe");
        System.out.println(hehe);

//        User hehe1 =run.getBean("hehe", User.class);
//        System.out.println(hehe1);

    }

}
