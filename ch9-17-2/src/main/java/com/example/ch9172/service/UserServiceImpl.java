package com.example.ch9172.service;

import com.example.ch9172.dao.BookDao;
import com.example.ch9172.dao.UserDao;
import com.example.ch9172.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class UserServiceImpl implements UserService {
    @Autowired(required = false)
    private  UserDao userDao;
    @Override
    public List<User> queryByUsernamePassword(Map<String, String> map) {
        return userDao.queryByUsernamePassword(map);
    }
}
