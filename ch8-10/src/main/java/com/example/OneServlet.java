package com.example;

import javax.servlet.*;

import java.io.IOException;
import java.io.PrintWriter;
//servlet接口的用法
public class OneServlet implements Servlet {
    ServletContext servletContext=null;
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
         servletContext = servletConfig.getServletContext();


    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
       servletRequest.setCharacterEncoding("utf-8");
        String username = servletRequest.getParameter("username");
        String password = servletRequest.getParameter("password");

        String user = servletContext.getInitParameter("user");
        String passwd = servletContext.getInitParameter("passwd");

        servletResponse.setContentType("text/html;charset=utf-8");
        PrintWriter out = servletResponse.getWriter();


        if(user.equals(username) && passwd.equals(password)){
            out.println("欢迎你"+username);
        }else {
             out.println("对不起");
        }

        

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
