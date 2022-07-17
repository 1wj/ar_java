package com.iweb.controller;

import com.iweb.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    private static List<User> users=new ArrayList<>();

    static {
        User user=new User("admin","123","Administrallor");
        users.add(user);
    }

    @RequestMapping(value = "/checkedUsername")
    public void checkedUsername(@RequestParam String name,
                                HttpServletResponse response) throws IOException {
        String result="{\"flag\":1}";
        for (User u : users) {
            if(u.getName().equals(name)){
                result="{\"flag\":0}";
                break;
            }
        }
        response.getWriter().print(result);
    }

}
