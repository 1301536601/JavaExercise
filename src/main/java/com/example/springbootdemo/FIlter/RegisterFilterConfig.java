package com.example.springbootdemo.FIlter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.FilterRegistration;

@Slf4j
@Configuration
public class RegisterFilterConfig {

    @Bean
    public FilterRegistrationBean   registration(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new LogFilter());
        bean.addUrlPatterns("/*");
        return bean;
    }
}
