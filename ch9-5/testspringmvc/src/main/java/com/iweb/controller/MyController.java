package com.iweb.controller;


import com.iweb.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class MyController {
    @RequestMapping(value = "/test1/{id}")
    public String test1(@PathVariable Integer id){
        System.out.println(id);
        return "success";
    }

    @RequestMapping(value = "/test2")
    public String test2(Model model){
        model.addAttribute("testModelKey","testModelValue");

        return "success";
    }

    @RequestMapping(value = "/test3")
    public String test3(@ModelAttribute User user){//相当于  model.addAttribute("user",user);
        user.setUserfullname("战三");
        return "success";
    }

    @RequestMapping(value = "/test5")
    public void test5(@RequestParam("username") String username, HttpServletResponse response) throws IOException {
        response.getWriter().print("hello"+username);

    }

    @RequestMapping(value = "/test6")
    public ModelAndView test6(ModelAndView mv) throws IOException {
        System.out.println("重定向到success，jsp");
        mv.setViewName("redirect:/jsp/success.jsp");
        return mv;
    }

    //请求转发取下一个控制器
    @RequestMapping(value = "/forwardToNextController")
    public ModelAndView forwardToNextController(ModelAndView mv) throws IOException {
        System.out.println("转发去下一个控制器");
        mv.setViewName("forward:/toNextController");
        return mv;
    }

    //重定向去下一个控制器
    @RequestMapping(value = "/redirectToNextController")
    public ModelAndView redirectToNextController(ModelAndView mv, RedirectAttributes ra) throws IOException {
        System.out.println("重定向去下一个控制器");
        ra.addFlashAttribute("message","hello");//不用mv.addObject是它底层的request
        mv.setViewName("redirect:/toNextController");
        return mv;
    }
}
