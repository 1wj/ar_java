package com.example.com.iweb;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OneServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cate cate=new Cate(1001,"玄幻","很玄幻","2021-01-01");
        Cate cate2=new Cate(1002,"修真","好修真","2021-01-01");
        Cate cate3=new Cate(1003,"仙侠","浩仙侠","2021-01-01");
        List<Cate> list=new ArrayList<>();
        list.add(cate);
        list.add(cate2);
        list.add(cate3);
        request.setAttribute("key001","value001");
        request.setAttribute("list",list);
        request.setAttribute("book","<<java编程思想>>");
        request.setAttribute("age",17);
        ServletContext sc=request.getServletContext();
        request.setAttribute("cate",cate);
        request.getSession().setAttribute("cate",cate2);
        sc.setAttribute("cate",cate3);
        request.setAttribute("com.iweb.test.Cate",cate);
        request.getRequestDispatcher("/success.jsp").forward(request,response);
    }


}
