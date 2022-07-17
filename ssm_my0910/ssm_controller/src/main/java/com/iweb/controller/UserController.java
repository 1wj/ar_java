package com.iweb.controller;

import com.iweb.model.Notice;
import com.iweb.model.PageModel;
import com.iweb.model.User;
import com.iweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    @Qualifier("userService")
    private UserService userService;

    @RequestMapping("/login")
    public ModelAndView login(String loginname, String password, ModelAndView mv, HttpSession session){

        List<User> list=userService.login2(new User(loginname,password));
        if(list !=null && list.size()>0){
            session.setAttribute("user_session",list.get(0));
            mv.setViewName("main");
        }else {
            mv.addObject("message","对不起，用户或密码错误");
            mv.setViewName("loginForm");
        }
        return mv;
    }

    @RequestMapping("/loginOut")
    public ModelAndView loginOut(HttpSession session,ModelAndView mv){
        session.removeAttribute("user_session");
        mv.setViewName("loginForm");
        return mv;
    }

    @RequestMapping("/selectUser")
    public String selectUser(String pageIndex, String likevalue, Model model){

        PageModel pageModel=new PageModel();//注意点不一定一样
        pageModel.setPageIndex(pageIndex!=null ? Integer.valueOf(pageIndex) : 1);

        List<User> users=userService.findUser(likevalue,pageModel);
        model.addAttribute("users",users);
        model.addAttribute("pageModel",pageModel);
        model.addAttribute("likevalue",likevalue);
        return "user/user";
    }

    @RequestMapping("/addUser")
    public ModelAndView addUser(@ModelAttribute User user, ModelAndView mv){
        userService.addUser(user);
        mv.setViewName("forward:/selectUser?pageIndex=1&likevalue=");
        return mv;

    }

    @RequestMapping("/toUpdateUser")
    public ModelAndView updateUser(String id, ModelAndView mv){
        User user=userService.findUserById(id);
        mv.addObject("user",user);
        mv.setViewName("user/addOrUpdateUser");
        return mv;

    }

    @RequestMapping("/updateUser")
    public ModelAndView updateUser(@ModelAttribute User user, ModelAndView mv){
        userService.updateUser(user);
        mv.setViewName("forward:/selectUser?pageIndex=1&likevalue=");
        return mv;

    }

    @RequestMapping("/deleteUser")
    public ModelAndView deleteUser(String id, ModelAndView mv){
        //设置跳转到查询页面
        mv.setViewName("forward:/selectUser?pageIndex=1&likevalue=");
        //查询用户下是否存在广告
        List<Notice> notices=userService.findNoticeByUserId(id);
        if(notices!=null && notices.size()>0){
            mv.addObject("deleteMessage","对不起，该用户存在公告");
        }else {
            userService.deleteUser(id);
        }
        return mv;

    }

    @RequestMapping("/checkLoginname")
    public void checkLoginname(String loginname, HttpServletResponse response) throws IOException {
        int i=userService.checkLoginnameByname(loginname);
        String json="";
        if(i==0){//代表存在
            json="{\"isflage\":0}";
        }else {
            json="{\"isflage\":1}";
        }
        response.setContentType("application/json;charset=utf-8");
        PrintWriter out=response.getWriter();
        out.println(json);
        out.flush();
        out.close();
    }



}
