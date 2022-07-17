package com.example.iweb;

import javax.servlet.*;
import java.io.IOException;

public class HelloFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("拦截");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
