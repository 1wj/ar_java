package cn.bj.class05;

import java.util.Scanner;

public class throwing2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i<0){
            //在运行过程中，满足这个条件会触发这个异常
            throw new RuntimeException("I<0了");
        }
        //throws和throw :throws是抛出异常 在方法声明上 有可能呢发生
        //throw 在方法体中抛出异常 只要运行到这个代码就一定会发生
    }
}
