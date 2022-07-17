package com.iweb.StringBuff;

import java.math.BigDecimal;
import java.util.Random;

public class MyStringBuffer {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("java");
        System.out.println(sb);
        sb.append(",oracle").append(",j2ee").append(",c++");
        System.out.println(sb);




        sb.delete(4,11);//前闭后闭
        System.out.println(sb);

        sb.delete(4,sb.length());
        System.out.println(sb);

        sb.insert(4,",html,");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

        System.out.println(Math.sqrt(81.0));
        System.out.println(Math.abs(100.2));
        System.out.println(Math.abs(-100.5));

        System.out.println(Math.round(3.55));
        System.out.println(Math.round(3.4));
        System.out.println(Math.max(3,4));
        System.out.println(Math.min(3,4));
        System.out.println(Math.pow(9,0.5));

        System.out.println(Math.random());
        System.out.println(Math.round(Math.random()*100));

        Random random=new Random();
        System.out.println(random.nextInt(101));
        System.out.println(random.nextDouble());

        //double 计算会有丢失
        double d1=1.2;
        double d2=1.1;
        System.out.println(d2-d1);

        BigDecimal b1=new BigDecimal(String.valueOf(d1));
        BigDecimal b2=new BigDecimal(String.valueOf(d2));

        BigDecimal subtract = b1.subtract(b2);
        double v = subtract.doubleValue();//之所以不用·Double.valueOf（字符串）

        BigDecimal add = b1.add(b2);
        double v1 = add.doubleValue();

        BigDecimal multiply = b1.multiply(b2);
        double v2 = multiply.doubleValue();

        BigDecimal divide = b1.divide(b2, 2, BigDecimal.ROUND_HALF_UP);
        double v3 = divide.doubleValue();

        System.out.println(add);
        System.out.println(multiply);
        System.out.println(divide);

    }
}
