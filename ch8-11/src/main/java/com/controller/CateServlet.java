package com.controller;

import com.domain.Cate;
import com.service.CateService;
import com.service.CateServiceImpl;
import com.util.PageModel;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class CateServlet extends HttpServlet {
    CateService service=new CateServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String path = request.getServletPath();
        System.out.println(path);
        if("/cate".equals(path)){
            queryAll(request,response);
        }
        if("/toAdd.category".equals(path)){
            response.sendRedirect(request.getContextPath()+"/addorupdate.jsp");
        }
        if("/addorupdate.category".equals(path)){
                addorupdate(request,response);
        }
        if("/toUpdate.category".equals(path)){
            toUpdate(request,response);
        }
        if("/deleteOne.category".equals(path)){
            deleteOne(request,response);
        }
        if("/logout.category".equals(path)){
            logout(request,response);

        }


    }
    /*
        安全退出
     */
    private void logout(HttpServletRequest request, HttpServletResponse response) throws IOException {
       //清session
        request.getSession().invalidate();
        response.sendRedirect(request.getContextPath()+"/index.jsp");
    }

    /*
        删除
     */
    private void deleteOne(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String cid = request.getParameter("cid");
         int res=service.deleteOne(cid);
         if(res>0){
             response.sendRedirect(request.getContextPath()+"/cate");
         }else {
             response.sendRedirect(request.getContextPath()+"/error.jsp");
         }
    }
    /*
        跳转到修改页面
     */
    private void toUpdate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String cid = request.getParameter("cid");
        Cate cate=service.queryById(cid);
        request.setAttribute("cate",cate);
        request.getRequestDispatcher("/addorupdate.jsp").forward(request,response);
    }
    /*
        新增或修改
     */
    private void addorupdate(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //不要重复提交
        HttpSession session=request.getSession();
        Object flag = session.getAttribute("myflag");
        String flagparam = request.getParameter("flag");
        if(flag != null && flag.equals(flagparam) ){
            session.removeAttribute("myflag");
        }else {
                response.sendRedirect(request.getContextPath()+"/token.jsp");

                return;
        }


        String cid = request.getParameter("cid");
        int i=0;
        String cname = request.getParameter("cname");
        String description = request.getParameter("description");


        if(cid != null && ! "".equals(cid))
            i=Integer.valueOf(cid);
        Cate cate=new Cate(i,cname,description,null);
        int res=0;

        //判断是新增还是修改
        if(i!=0){
            res=service.updateOne(cate);
        }else {
            res=service.saveOne(cate);
        }
        //判断返回结果
        if(res>0){
            try {

                //request.getRequestDispatcher("/index.jsp").forward(request,response);

                response.sendRedirect(request.getContextPath()+"/cate");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            try {
                response.sendRedirect(request.getContextPath()+"/error.jsp");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    /*
        查询全部
     */
    private  void queryAll(HttpServletRequest request,HttpServletResponse response) throws IOException {
      int pageNo=request.getParameter("pageNo")==null ? 1 : Integer.valueOf(request.getParameter("pageNo"));
      String likeValue = request.getParameter("likeValue");

      PageModel pageModel=new PageModel();
      pageModel.setPageNo(pageNo);
      pageModel.setLikeValue(likeValue);

      List<Cate> list=new ArrayList<>();
        list=service.queryAll(likeValue, pageModel);


        pageModel.setPageData(list);

        request.setAttribute("pageModel",pageModel);
      try {
          request.getRequestDispatcher("/cateshow.jsp").forward(request,response);
      } catch (ServletException e) {
          e.printStackTrace();
      } catch (IOException e) {
          e.printStackTrace();
      }
  }
}
