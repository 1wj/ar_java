package org.example;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.cn.bj.dao.*;
import org.cn.bj.domain.Dept;
import org.cn.bj.domain.Person;
import org.cn.bj.domain.Teacher;
import org.cn.bj.domain.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.lang.model.element.NestingKind;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class T1 {
    InputStream in=null;
    SqlSessionFactory factory=null;
    SqlSession session=null;
    UserDao userDao=null;
    CardDao cardDao=null;
    PersonDao personDao=null;
    DeptDao deptDao=null;
    TeacherDao teacherDao=null;
    @Before
    public  void  before(){
        try {
            String confit = "mybatis-config.xml";
            in = Resources.getResourceAsStream(confit);
            //由sqlsessionBuilder对象调用build（）创建二级缓存
            factory = new SqlSessionFactoryBuilder().build(in);
            //有二级缓存调opensession创建一级缓存对象
            session = factory.openSession();
            userDao=session.getMapper(UserDao.class);
            cardDao=session.getMapper(CardDao.class);
            personDao=session.getMapper(PersonDao.class);
            deptDao=session.getMapper(DeptDao.class);
            teacherDao=session.getMapper(TeacherDao.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @After
    public void after(){
        session.commit();
        session.close();
    }

    @Test
    public void shouldAnswerWithTrue() {
            User o = session.selectOne("org.cn.bj.dao.UserDao.selectUserByid", "10");
            System.out.println(o);
    }

    @Test
    public void test2(){
        User u=new User() ;
        u.setUserid("2002");
        u.setUname("许荣");
        u.setUpwd("123456");
        int insert = session.insert("org.cn.bj.dao.UserDao.saveOne", u);
        System.out.println(insert);
    }

    @Test
    public void test3(){
        List<User> list=session.selectList("org.cn.bj.dao.UserDao.selectAll");
       // System.out.println(list);
        list.forEach(stu-> System.out.println(stu));
    }

    @Test
    public void test4(){
        List<Map<String,Object>> list=session.selectList("org.cn.bj.dao.UserDao.selectAll2");
        // System.out.println(list);
        list.forEach(stu-> System.out.println(stu));
    }
    @Test
    public void test5(){
        List<User> list=session.selectList("org.cn.bj.dao.UserDao.selectAll3");
        // System.out.println(list);
        list.forEach(stu-> System.out.println(stu));
    }

    @Test
    public void test6(){
        User u=new User() ;

        u.setUname("marry");
        u.setUpwd("123456");
        int insert = session.insert("org.cn.bj.dao.UserDao.saveTwo", u);
        System.out.println(insert);
    }

    @Test
    public void test7(){
       Map<String,Object> map=new HashMap<>();
       map.put("userid","2002");
       map.put("uname","lisi");
       map.put("upwd","123456");
        int insert = session.insert("org.cn.bj.dao.UserDao.saveThree", map);
        System.out.println(insert);
    }

    @Test
    public void test8(){
        User u=session.selectOne("org.cn.bj.dao.UserDao.selectUserByid","2002");
        u.setUpwd("654213");
        int insert = session.insert("org.cn.bj.dao.UserDao.updateOne", u);
        System.out.println(insert);
    }

    @Test
    public void test9(){
        Map<String,Object> map=new HashMap<>();
        map.put("userid","2002");
        map.put("uname","lisi");
        map.put("upwd","456");
        int update = session.update("org.cn.bj.dao.UserDao.updateOne", map);
        System.out.println(update);
    }

    @Test
    public void test10(){

        int delete = session.delete("org.cn.bj.dao.UserDao.deleteOne", "2003");
        System.out.println(delete);
    }

    //动态实现
    @Test
    public void test11(){

        User user = userDao.selectUserByid("2002");
        System.out.println(user);
    }

    //动态SQL
    @Test
    public void test12(){
        Map<String,String> map=new HashMap<>();
        map.put("userid","2002");
        map.put("upwd","456");

        List<User> users = userDao.queryByParam(map);
       users.forEach(str-> System.out.println(str));
    }

    @Test
    public void test13(){
      String personid="1001";
      Person person=personDao.queryByPno(personid);
        System.out.println(person);
    }

    @Test
    public void test14(){

        Teacher teacher =teacherDao.queryByTnoFoundDept("t001");
        System.out.println(teacher);
        System.out.println(teacher.getDept());
    }
    @Test
    public void test15(){
        Dept dept =deptDao.queryDeptByDeptIdFoundTeacher("1001");
        System.out.println(dept);
        System.out.println(dept.getTeachers());
    }
}
