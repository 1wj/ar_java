package com.controller;

import com.domain.Cate;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TwoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String str = request.getParameter("str");
//        Cate c=new Cate("1004",str)
        List<Cate> list=new ArrayList();
        list.add(new Cate(1001,"玄幻","很玄幻",null));
        list.add(new Cate(1002,"修真","很玄幻",null));
        list.add(new Cate(1003,"武侠","很玄幻",null));
        int flag=1;
        for (Cate c:list  ) {
            if(c.getCname().equals(str)){
               flag=0;
               break;
            }
        }

        String path="{\"ispass\":"+flag+"}";

        response.getWriter().print(path);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
