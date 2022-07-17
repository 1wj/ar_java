package com.example.ch9172.dao;

import com.example.ch9172.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface UserDao {
     List<User> queryByUsernamePassword(Map<String,String> map);
}
