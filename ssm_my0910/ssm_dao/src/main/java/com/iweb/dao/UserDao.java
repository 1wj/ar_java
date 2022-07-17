package com.iweb.dao;

import com.iweb.model.Notice;
import com.iweb.model.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    //用户登录
    User findByLoginAndPassword(Map<String,Object> map);

    User findByLoginAndPassword2(User user);

    int count(Map<String, Object> params);

    List<User> selectByPage(Map<String, Object> params);

    int addUser(User user);

    User findUserById(String id);

    int updateUser(User user);

    List<Notice> findNoticeByUserId(String id);

    int deleteUser(String id);

    User checkLoginnameByname(String loginname);
}
