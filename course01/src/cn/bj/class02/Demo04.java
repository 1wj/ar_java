package cn.bj.class02;

public class Demo04 {
    public static void main(String[] args) {
        //String
        String s = new String("abc"); //最终会去常量池
        String ss = new String("abc"); //最终会去常量池
        String s1="abc";
        String s2="abc";
        //对象的比较 ==比较基本数据类型 比较的值是否相等
        //比较引用数据类型 比较的是是否为同一个引用也就是引用是否相等
        System.out.println(s==s1);
        System.out.println(s2==s1);
        System.out.println(s==ss);
    }
}
