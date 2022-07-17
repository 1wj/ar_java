package com.iweb.homework;

public class FireProofDoor extends Door{
    @Override
    public void openDoor() {
        System.out.println("打开防火门");
    }

    @Override
    public void closeDoor() {
        System.out.println("关闭防火门");
    }

    public void fireProof(){
        System.out.println("我是防火门");
    }
}
