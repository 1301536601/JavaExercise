package com.example.springbootdemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;
import java.util.List;

@Configuration
public class HttpMessageConvertDemo implements WebMvcConfigurer {

    @Resource
    private CustomHttpMessageConverter customHttpMessageConverter;


    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(customHttpMessageConverter);
    }
}
