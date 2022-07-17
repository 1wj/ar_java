package com.iweb.生产者消费者;

/**
 * 生产者
 */
public class Producer implements Runnable{
    ManTouStack mts=null;
    private String name;
    public Producer() {
    }

    public Producer(ManTouStack mts, String name) {
        this.mts = mts;
        this.name = name;
    }

    public Producer(ManTouStack mts) {
        this.mts = mts;
    }

    public ManTouStack getMts() {
        return mts;
    }

    public void setMts(ManTouStack mts) {
        this.mts = mts;
    }

    @Override
    public void run() {
        for (int i=1;i<=40;i++){
            ManTou mt=new ManTou();
            mts.push(mt,name);
            try {
                Thread.sleep( (int)(Math.random()*1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
