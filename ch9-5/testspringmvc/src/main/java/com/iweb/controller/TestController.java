package com.iweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping("/toNextController")
    public String testCon(@ModelAttribute("message") String message){
        System.out.println("我是测试控制器");
        System.out.println("重定向前传入的数据"+message);
        return "success";
    }
}
