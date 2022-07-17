package cn.bj.class01;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.HashMap;
//算术 比较 逻辑运算符
public class Demo01 {
    public static void main(String[] args) {
        //算术运算符
        int a=3;
        int b=4;
        System.out.println(2-1.1);
    //    System.out.println(2/0);
        System.out.println(2.0/0);
        System.out.println(98 -'a');
        System.out.println('a' -'A');
        //比较运算符
        System.out.println(a>b);
        //逻辑运算符
        // ! ,& ,|  &&短路 , ||断路
        boolean c=(a>b) && (b>a);
        boolean d=(a>b) || (b>a);
        boolean e=(a>b) ^ (b>a); //异或
        int f =1 >> 4;
        //三目运算符：      （比较运算符）?表达式1：表达式二2；
        int x=10;
        int y=200;
        int z=30;
       // int max=((x>y)?x:y)<z?z:((x>y)?x:y);

        int max1=((max1=(x>y)?x:y)>z?max1:z);
        System.out.println(max1);

        for (byte i = 0; i <128; i++) {
            System.out.println(i);
        }

        int sum=0;
       //奇数
        for (int i = 1; i <=100 ; i+=2) {
           sum+=i;

        }
        System.out.println(sum);
        //偶数
           int sum1=0;
        for (int i=0;i<=100;i+=2){
            sum1+=i;

        }
        System.out.println(sum1);
    }
}

