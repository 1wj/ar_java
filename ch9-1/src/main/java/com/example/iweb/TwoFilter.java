package com.example.iweb;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class TwoFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String pwd = servletRequest.getParameter("pwd");
        System.out.println("我是第二个拦截器"+pwd);
        if("abc".equals(pwd)){
            filterChain.doFilter(servletRequest,servletResponse);
        }else {
            servletRequest.setAttribute("key","密码错误");
            servletRequest.getRequestDispatcher("/error1.jsp").forward(servletRequest,servletResponse);

        }



    }
}
