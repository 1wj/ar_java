package cn.bj.class03;


//设计模式中的单例模式   饿汉式 加载方式设计全局加载
//缺点是会造成资源的浪费
//优点是响应速度快
public class User {

    //私有化成员变量 仅对外提供公共的访问方式
    // 每个变量的范围在所定义的大括号里面  成员 局部
    //


    private static  User e= new User();

    private User(){

    }

  public User getUser(){
      return e;
  }



}
