package com.iweb.controller;

import com.iweb.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class TwoControlelr {
   private static List<User> users=new ArrayList<>();
    @RequestMapping(value = "/login")
    public String  log(@RequestParam String name,
                       @RequestParam String password,
                       @RequestParam String userfullname){

        User user=new User(name,password,userfullname);
        users.add(user);
        return "denglu";
    }

    @RequestMapping(value = "/denglu")
    public ModelAndView denglu(ModelAndView mv, @RequestParam String name, @RequestParam String password,
                         HttpSession session){
        System.out.println("开始登陆");
        mv.setViewName("denglu");
        mv.addObject("message","对不起用户或密码错误");
        for (User u : users) {
            if(u.getName().equals(name) && u.getPassword().equals(password)){
                mv.setViewName("success");
                session.setAttribute("user",u);
                mv.addObject("jj",u);//这两个都行 一个是session 一个是request
               break;
            }
        }
      return mv;
    }

}
