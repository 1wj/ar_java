package com.iweb.service;

import com.iweb.model.Notice;
import com.iweb.model.PageModel;
import com.iweb.model.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    //用户登录
    User login(Map<String,Object> map);

    List<User> login2(User user);

    List<User> findUser(String likevalue, PageModel pageModel);

    void addUser(User user);

    User findUserById(String id);

    void updateUser(User user);

    List<Notice> findNoticeByUserId(String id);

    void deleteUser(String id);

    int checkLoginnameByname(String loginname);
}
