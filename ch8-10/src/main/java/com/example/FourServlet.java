package com.example;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

//请求转发
public class FourServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            request.setAttribute("key",1);
            request.getRequestDispatcher("/t2.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
