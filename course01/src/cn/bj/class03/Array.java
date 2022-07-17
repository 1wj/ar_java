package cn.bj.class03;

public class Array {
    public static void main(String[] args) {
        //二维数组里装了多少一维数组 一维数组的长度
        int [][] arr=new int[2][3];
        arr[0][0]=1;
        arr[0][1]=1;
        arr[0][2]=1;

        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }


    }
}
