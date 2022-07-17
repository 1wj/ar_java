package com.example;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
//servletRequest是父 httpServletRequset是子  父类型引用转子类型对象
public class TwoServlet implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    //一般请求协议包中的HTTPServletResponse  是servletRequest子类 父类型引用指向子类型对象
    // 考虑转型，就可以用子类中独有的方法

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;

        System.out.println(httpServletRequest.getRequestURI());
        System.out.println(httpServletRequest.getMethod());
        System.out.println(httpServletRequest.getQueryString());
        System.out.println(httpServletRequest.getServletContext().getClass());
        System.out.println(httpServletRequest.getContextPath());
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
