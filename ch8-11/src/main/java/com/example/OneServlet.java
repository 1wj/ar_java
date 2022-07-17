package com.example;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class OneServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           request.setAttribute("key",1);

        String path = request.getServletPath();
        System.out.println(path);
        String path1 = request.getContextPath();
        System.out.println(path1);
        //response.sendRedirect("/ch8_11/1.jsp");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
