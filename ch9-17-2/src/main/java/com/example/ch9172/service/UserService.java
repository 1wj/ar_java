package com.example.ch9172.service;

import com.example.ch9172.domain.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    List<User> queryByUsernamePassword(Map<String,String> map);
}
