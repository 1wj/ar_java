package org.cn.bj.dao;

import org.cn.bj.domain.User;

import javax.jws.soap.SOAPBinding;
import java.util.List;
import java.util.Map;

public interface UserDao {
    User selectUserByid(String userid);
    int saveOne(User user);
    List<User> selectAll();
    List<Map<String,Object>> selectAll2();
    List<User> selectAll3();
    int saveTwo(User user);
    int saveThree(Map<String,Object> map);
    int updateOne(User user);
    int deleteOne(String userid);

    List<User> queryByParam(Map<String,String> map);


}
