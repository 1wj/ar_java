package com.example.iweb;

import javax.servlet.*;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class OneListener implements ServletContextListener, ServletRequestListener, HttpSessionListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("application对象被创建");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("appplication对象被销毁");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("请求对象销毁");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("请求对象创建");
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("会话对象创建");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("会话对象销毁");
    }
}
