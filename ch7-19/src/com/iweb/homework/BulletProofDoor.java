package com.iweb.homework;

public class BulletProofDoor extends Door{
    @Override
    public void openDoor() {
        System.out.println("打开防弹门");
    }

    @Override
    public void closeDoor() {
        System.out.println("关闭防弹门");
    }

    public void bulletproof(){
        System.out.println("我是防弹门");
    }
}
