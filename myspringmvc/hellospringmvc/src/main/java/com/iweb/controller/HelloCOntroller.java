package com.iweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class HelloCOntroller {

    @RequestMapping("/hello")
    public String  hello(HttpServletRequest request, HttpSession session){
        System.out.println("来了一个请求");
        System.out.println(session.getAttribute("sessionkey"));
        System.out.println(request.getAttribute("requestkey"));//会报错不是同一个request
       System.out.println(request.getServletContext().getAttribute("applicationkey"));
       request.setAttribute("rkey2","rvalue2");
       session.setAttribute("skey2","svalue2");
       request.getServletContext().setAttribute("akey2","avalue2");
        return "succes";
    }

    @RequestMapping("/test1")
    public ModelAndView test1(ModelAndView mv){
        System.out.println("我可以携带一个数据进行转发");
        mv.addObject("mykey001","myvalue001");
        mv.setViewName("succes");//设置转发分页面
        return mv;
    }

    @RequestMapping(value = "/test2",method = RequestMethod.POST)
    public String test2(){
        System.out.println("我是一个post请求");
        return "succes";
    }

    @RequestMapping(value = "/test3")
    public String test3(@RequestParam("name") String username,
                        @RequestParam String age){ //当参数名和形参名一致时可以省略小括号
        System.out.println("name   "+username);
        System.out.println("age   "+age);
        return "succes";
    }
}
