package cn.bj.class02;


import java.lang.reflect.Array;

public class WuRen {
    public static void main(String[] args) {
        //五个人围成一圈，轮流报数，报数到三的人退出 剩下的人继续报数，直到还剩下一个人 剩下的这个人是几号
     /*   int [] arr= new int[5];
        int count=0,i=0,n=5 ,src=n;
      while(true){

              if (arr[i]!=1){
                  if(i%3==0){
                      arr[i]=1;
                      n--;
                  }
              }
             i=++i%n;
          for (int a :arr) {
              if(a==0)
                 count++;
          }
          if (count==1)
              break;
      }*/
        int a=yiQuan(5);
        System.out.println("最后获胜人的编号是:"+a);

    }

    public static int yiQuan(int n){
        int[] arr = new int[n];//定义一个
        for(int i=0;i<arr.length;i++){
            arr[i]=i+1;
        }
        int count=0;int src=n;int index=0;
        while(n>1) {
            if (arr[index]!= -1) {
                count++;
            }
            if (count == 3) {
                arr[index] = -1;
                count = 0;    //以3循环计数
                n--;
            }
            index = ++index % src;   //保证首尾循环报数
        }
        for(int i=0;i<src;i++){
            if( arr[i]!=-1){
                return arr[i];
            }
        }
        return -1;
    }



}
