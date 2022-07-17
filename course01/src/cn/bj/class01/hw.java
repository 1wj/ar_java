package cn.bj.class01;

public class hw {
    public static void main(String[] args) {
        //1.计算1+2-3+4-5+6-7....+100的结果
       /* int sum=1,flag=1;
        for (int i = 2; i <100 ; i++) {
            sum+=i*flag;
            flag*=-1;
        }
        System.out.println("sum="+sum);*/
        //2.打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身
      /*  int j,a,b,c;
        for (int i=100;i<=999;i++){
            j=i;
            a=i%10;
            b=(i/10)%10;
            c=(i/100);
            if(j==(Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3))){
                System.out.println("  i="+i);
            }
        }*/

        //3.求10的阶乘 ，例如：5的阶乘=5*4*3*2*1
   /*     int sum=0,p=1;
        for (int i = 1; i <=10 ; i++) {
            p=p*i;
            //sum=sum+p;
        }
        System.out.println("10的阶乘为"+p);*/
    }

}
