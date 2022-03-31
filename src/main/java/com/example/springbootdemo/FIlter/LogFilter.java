package com.example.springbootdemo.FIlter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

/**
 * 通过Component方式加入到容器中
 */
@Slf4j
//@Component
public class LogFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.error("当前请求信息为:"+servletRequest.getLocalAddr()+servletRequest.getLocalPort());
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
