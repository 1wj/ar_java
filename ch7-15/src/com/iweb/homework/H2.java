package com.iweb.homework;

import java.util.Scanner;

public class H2 {
    /**
     * 2、在歌唱比赛中，共有10位评委进行打分，在计算歌手得分时，去掉一个最高分，去掉一个最低分，
     *    然后剩余的8位评委的分数进行平均，就是该选手的最终得分。输入每个评委的评分，求某选手的得分。
     *    (从键盘依次输入10位评委的得分，然后存入数组，依次输出它们的打分，以及输出最终得分)
     */
    public static void main(String[] args) {
        double [][] arr =new double[10][2];
        Scanner sc=new Scanner(System.in);
        double score=0,max=0,min=100,sum=0;
        int index=0,index1=0;
        System.out.println("评委给学生打分");
        //输入
        for (int i = 0; i < arr.length; i++) {
            arr[i][0]=i+1.0;
            score=sc.nextDouble();
            if(max<score){
                max=score;
                index=i;
            }
            if(min>score){
                min=score;
                index1=i;
            }
            arr[i][1]=score;
        }
        //计算总和
        for (int i = 0; i < arr.length; i++) {
            if(i ==index || i==index1)
                continue;
            sum+=arr[i][1];
        }

        //输出
        System.out.println("评委老师的分数");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][1]+"    ");
        }
        System.out.println("    ");
        System.out.print("平均分："+sum/8);

    }

}
