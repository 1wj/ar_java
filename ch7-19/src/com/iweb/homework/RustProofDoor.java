package com.iweb.homework;

public class RustProofDoor extends Door{
    @Override
    public void openDoor() {
        System.out.println("打开防锈门");
    }

    @Override
    public void closeDoor() {
        System.out.println("关闭防火门");
    }

    public void rustProof(){
        System.out.println("我是防锈门");
    }
}
