package com.iweb.生产者消费者;

public class Consuer implements Runnable{

    ManTouStack mts=null;
    private String name;
    public Consuer(ManTouStack mts) {
        this.mts = mts;
    }

    public Consuer(ManTouStack mts, String name) {
        this.mts = mts;
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <=20; i++) {
            ManTou pop = mts.pop(name);
            try {
                Thread.sleep((int)(Math.random()*2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
