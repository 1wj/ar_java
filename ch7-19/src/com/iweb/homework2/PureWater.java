package com.iweb.homework2;

public class PureWater extends Water implements BuZhou{
    public PureWater() {
        this.huanChong();
        this.guoLv();
        this.jiaRei();
        this.fangTang();

    }


    @Override
    public void huanChong() {
        System.out.println("缓冲");
    }

    @Override
    public void guoLv() {
        System.out.println("过滤");
    }

    @Override
    public void jiaRei() {
        System.out.println("加热");
    }

    @Override
    public void fangTang() {
        System.out.println("放糖");
    }
}
