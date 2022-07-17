package cn.bj.class01;

//兔子，99表 猴子吃桃 买鸡
public class Demo02 {
    public static void main(String[] args) {
      /*  兔子
        int a=1;
        int b=1;
        int sum=0;
        for (int i = 0; i <9 ; i++) {
           a=a+b;
           b=b+a;
        }
        System.out.println("a="+a);
        System.out.println("b="+b);

        a=1;
        b=1;
        sum=0;
        for (int i = 0; i <18; i++) {
            sum=a+b;
            a=b;
            b=a+sum;
        }*/

        //猴子吃桃
       /* int x=1;
        for (int i = 9; i >=1 ; i--) {
            x=(x+1)*2;
        }
        System.out.println(x);*/


       //99乘法表
      /*  for (int i = 1; i <= 9 ; i++) {

            for (int j = 1;j <= i;j++){
                System.out.print( j+"*"+i+"="+i*j+"  " );
            }
            System.out.println(" ");
        }*/

  /*      int count =0;
        for (int i = 1; i <= 32 ; i++) {
            for(int j = 1;j <= 96;j++){
                for (int z = 1;z <= 96 ;z++){
                    if (3*i+j+z==100 && i+j+3*z==100) {
                        count++;
                        System.out.println("i="+i+" j="+j+" z="+z);
                    }
                }
            }
        }
        System.out.println("一共多少种买法:"+count);
    }*/
        int count =0;
        for (int i = 0; i <= 33 ; i++) {
            for(int j = 0;j <= 100;j++){
                for (int z = 0; z <= 100 ;z++){
                    if (3*i+j+z==100 && i+j+3*z==100) {
                        count++;
                        System.out.println("i="+i+" j="+j+" z="+z*3);
                    }
                }
            }
        }
        System.out.println("一共多少种买法:"+count);
    }


}
