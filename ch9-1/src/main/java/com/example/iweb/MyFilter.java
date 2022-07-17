package com.example.iweb;

import javax.servlet.*;
import java.io.IOException;

public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println(filterConfig.getInitParameter("name"));
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        /*从web.xml中获取用户名来比对
        ServletContext sc = servletRequest.getServletContext();
        String username = sc.getInitParameter("username");
        */
        String uname = servletRequest.getParameter("uname");
        System.out.println("我是第一个拦截器:"+uname);
        if("wj".equals(uname)){
            filterChain.doFilter(servletRequest,servletResponse);
        }else {
            servletRequest.setAttribute("key","账号错误");
            servletRequest.getRequestDispatcher("/error1.jsp").forward(servletRequest,servletResponse);
        }


    }
}
