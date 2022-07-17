package com.example.domian;

import javax.servlet.*;
import java.io.IOException;

public class tt implements Servlet {
    public tt(){
        System.out.println("创建了一个servlet对象");
    }
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("对该servlet对象进行初始化");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("来了一个请求");
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
