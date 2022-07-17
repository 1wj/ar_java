package com.example;

import com.dao.Userdao;
import com.domain.User;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
//httpservlet接口实现类的用法
public class ThreeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("有个get");
        System.out.println(request.getParameter("name"));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Userdao userdao=new Userdao();
       int re = userdao.serlect(username, password);
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        if(re !=0){
           out.println("成功");
        }else {
            out.println("失败");
        }
    }
}
