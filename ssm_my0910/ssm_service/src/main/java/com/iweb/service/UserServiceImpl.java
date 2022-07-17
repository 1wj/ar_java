package com.iweb.service;

import com.iweb.dao.UserDao;
import com.iweb.model.Notice;
import com.iweb.model.PageModel;
import com.iweb.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public User login(Map<String, Object> map) {
        return userDao.findByLoginAndPassword(map);
    }

    @Override
    public List<User> login2(User user) {
        User user1 = userDao.findByLoginAndPassword2(user);
        List<User> users=new ArrayList<>();
        users.add(user1);
        return users;
    }

    @Override
    public List<User> findUser(String likevalue, PageModel pageModel) {
        //当前需要分页的总数据条数
        Map<String,Object> params=new HashMap<>();
        params.put("likevalue",likevalue);
        //查询总记录数
        int recordCound=userDao.count(params);
        pageModel.setRecodeCount(recordCound);
        //开始分页查询
        params.put("pageIndex",pageModel.getPageIndex());
        params.put("pageSize",pageModel.getPageSize());
        List<User> users=userDao.selectByPage(params);
        pageModel.setTotalSize();
        return users;
    }

    @Override
    public void addUser(User user) {
     int i=userDao.addUser(user);
    }

    @Override
    public User findUserById(String id) {
        return userDao.findUserById(id);
    }

    @Override
    public void updateUser(User user) {
        int i=userDao.updateUser(user);

    }

    @Override
    public List<Notice> findNoticeByUserId(String id) {
        List<Notice> notices=new ArrayList<>();
        notices=userDao.findNoticeByUserId(id);
        return notices;
    }

    @Override
    public void deleteUser(String id) {
        int i=userDao.deleteUser(id);
    }

    @Override
    public int checkLoginnameByname(String loginname) {
        User user=userDao.checkLoginnameByname(loginname);
        if(user!=null){
            return 0;//0代表存在
        }
        else return 1;
    }
}
