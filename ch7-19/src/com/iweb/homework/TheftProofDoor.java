package com.iweb.homework;

public class TheftProofDoor extends Door{
    @Override
    public void openDoor() {
        System.out.println("打开防盗门");
    }

    @Override
    public void closeDoor() {
        System.out.println("关闭防盗门");
    }

    public void theftproof(){
        System.out.println("我是防盗门");
    }
}
