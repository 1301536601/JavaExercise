package com.example.springbootdemo.FIlter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletContextListener;

@Slf4j
@Configuration
public class RegisterWebListener {

    @Bean
    public ServletListenerRegistrationBean<AppListener> servletListenerRegistrationBean(){
        return new ServletListenerRegistrationBean<AppListener>(new AppListener());
    }
}
