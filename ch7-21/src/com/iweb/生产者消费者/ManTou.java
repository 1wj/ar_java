package com.iweb.生产者消费者;

public class ManTou {
    private int id;
    public static int sid=1;
    public ManTou() {

        this.id = sid++;
    }

    @Override
    public String toString() {
        return "ManTou{" +
                "id=" + id +
                '}';
    }
}
