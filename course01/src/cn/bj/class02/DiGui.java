package cn.bj.class02;

public class DiGui {
    //递归算法：将一个问题 由小变大 最终变成可以直接得到答案的结果
    /**
     * 方法本身调用自己的过程
     * 直接等于答案的时候退出 出口条件的配置
     * 循环条件 循环调用自己的条件
     */
    public static void main(String[] args) {
        int i = tuZi2(20);
        System.out.println(i);
    }

    public static int tuZi(int num){
        if (num==1 ||num==2 )
            return 1;
        else {
            return tuZi(num-1)+tuZi(num-2);
        }
    }

    public static int tuZi2(int num){
      int [] arr=new int[num];
      arr[0]=1;
      arr[1]=1;
        for (int i = 2; i <arr.length; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }
      return arr[arr.length-1];
    }



    public static int jieCh(int num){
        if (num==1)
            return num;
        else {
            return num*jieCh(num-1);
        }
    }

}
