package com.iweb.homework;

public class WaterProofDoor extends Door{
    @Override
    public void openDoor() {
        System.out.println("打开防水门");
    }

    @Override
    public void closeDoor() {
        System.out.println("关闭防水门");
    }

    public void waterproof(){
        System.out.println("我是防水门");
    }
}
