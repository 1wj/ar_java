package com.iweb.homework;

public class T2 {
    public static void main(String[] args) {
        //可以尝试写个静态方法在里面判断是什么门然后调用相应的方法
        Door d1=new TheftProofDoor();
        TheftProofDoor t=(TheftProofDoor)d1;
        t.theftproof();

        Door d2=new FireProofDoor();
        FireProofDoor d=(FireProofDoor)d2;
        d.fireProof();

        Door d3=new RustProofDoor();
        RustProofDoor r=(RustProofDoor)d3;
        r.rustProof();


        Door d4=new BulletProofDoor();
        BulletProofDoor b=(BulletProofDoor)d4;
        b.bulletproof();

        Door d5=new WaterProofDoor();
        WaterProofDoor w=(WaterProofDoor)d5;
        w.waterproof();

    }
}
