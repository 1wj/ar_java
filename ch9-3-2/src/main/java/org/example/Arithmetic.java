package org.example;

import org.springframework.stereotype.Component;

//业务逻辑类
@Component
public class Arithmetic {
    public int add(int i,int j){
        int result=i+j;
        return result;
    }
    public int sub(int i,int j){
        int result=i-j;
        return result;
    }
    public int mul(int i,int j){
        int result=i*j;
        return result;
    }
    public int div(int i,int j){
        int result=i/j;
        return result;
    }
}
