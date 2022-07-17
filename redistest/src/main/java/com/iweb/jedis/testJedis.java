package com.iweb.jedis;


import redis.clients.jedis.Jedis;
import redis.clients.jedis.Response;
import redis.clients.jedis.Transaction;

import java.util.Set;

public class testJedis {
    public static void main(String[] args) {
        //连接Redis，
        Jedis jedis=new Jedis("192.168.77.110",6379);
        //使用redis对象来操作命令
       // String ping = jedis.ping();

       /* Set<String> keys = jedis.keys("*");
        for (String key:keys  ) {
            System.out.println(key);
        }*/

      /*  Boolean k1 = jedis.exists("k1");
        System.out.println(k1);*/

      /*  Long k2 = jedis.move("k2", 1);
        System.out.println(k2);*/

      /*  jedis.select(1);
        String k21 = jedis.get("k2");
        System.out.println(k21);*/

       /* String k2 = jedis.set("k2", "1");
        System.out.println(k2);*/

      /*  Long append = jedis.append("k1", "abc");
        System.out.println(append);*/

       /* Long k2 = jedis.incr("k2");
        System.out.println(k2);*/

        //事务
        //获取事务对象
        Transaction tran = jedis.multi();
        tran.set("t1", "shiwukaishi ");
        tran.set("t2","shiwuzhongjian ");
        tran.set("t3","shiwujieshu ");
        tran.exec();

    }
}
