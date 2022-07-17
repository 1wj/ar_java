package com.example;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
//重定向
public class FiveServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           request.setAttribute("key",2);
            response.sendRedirect("/ch8_10/t2.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
