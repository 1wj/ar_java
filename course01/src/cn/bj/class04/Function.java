package cn.bj.class04;

public interface Function {

    /**
     * 接口是多继承的
     *  接口里只有抽象方法 和常量
     *      不能有构造方法
     *      public abstract 默认不用写
     * 如何选择接口还是抽象类
     *     接口注重功能的
     *      抽象类注重业务的
     */
    int NUM=3;
    void eat();
    void play();

    //default 修饰普通方法 仅限jdk1。8之后
    default void  avg(){

    }

}
