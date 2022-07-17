package com.iweb.异常处理;

public class T4 {
    public static void main(String[] args) {
        try {
            f(5000);
        } catch (MyException e) {
            System.out.println("工资过高");
        }
    }
    static void f(int i) throws MyException {
        if(i>=5000)
            throw new MyException();
    }
}
