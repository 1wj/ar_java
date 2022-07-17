package com.domian;

import javax.servlet.*;
import java.io.IOException;

public class tt implements Servlet {
    public tt(){
        System.out.println("创建了一个servlet对象");


    }
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("对该servlet对象进行初始化");

        //获取一个隐秘的配置文件的超级管理员
        String username = servletConfig.getInitParameter("username");
        System.out.println(username);
        String servletName = servletConfig.getServletName();
        System.out.println(servletName);

        //之前的是当前Servlet的管家，这个是得到整个web的大管家
        ServletContext servletContext = servletConfig.getServletContext();
        String password = servletContext.getInitParameter("password");
        System.out.println(password);

        //获得当前web应用的根目录
        String path = servletContext.getContextPath();
        System.out.println(path);


        //获取某个页面的绝对路径
        String realPath = servletContext.getRealPath("/login.html");
        System.out.println(realPath);
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("来了一个请求");
        servletRequest.setCharacterEncoding("utf-8");
        String v1 = servletRequest.getParameter("username");
        String v2 = servletRequest.getParameter("password");
        System.out.println(v1);
        System.out.println(v2);
        String [] v3= servletRequest.getParameterValues("hobby");
        for (String v:v3) {
            System.out.println(v);
        }

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("servlet对象被销毁");
    }
}
