package com.example.ch9172.controlle;

import com.example.ch9172.domain.User;
import com.example.ch9172.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@CrossOrigin
@RestController
@RequestMapping("/login")
public class RestLoginController {
    @Autowired
    UserService userService;

    @GetMapping
    public boolean login(@RequestParam("loginname") String username,
                         @RequestParam("password") String password){
        Map<String,String> map=new HashMap<>();
        map.put("username",username);
        map.put("password",password);
        List<User> users = userService.queryByUsernamePassword(map);
        return users != null && users.size()>0;
    }
}
