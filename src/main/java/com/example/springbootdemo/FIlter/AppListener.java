package com.example.springbootdemo.FIlter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@Slf4j
public class AppListener implements ServletContextListener  {

    @Override
    // 在此初始化WebApp,例如打开数据库连接池等:
    public void contextInitialized(ServletContextEvent sce) {
        log.error("WebApp initialized");
    }

    @Override
    // 在此清理WebApp,例如关闭数据库连接池等:
    public void contextDestroyed(ServletContextEvent sce) {
        log.error("WebApp destroyed");
    }
}
