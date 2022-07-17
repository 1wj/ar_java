package com.iweb.hw.p2;

/**
 * 2.编写程序,从字符串”want you to konw one thing”中统计出字幕”n”的出现次数
 */
public class T2 {
    public static void main(String[] args) {
        String i="want you to know one thing";
        int count=0;
        int len=i.length();
        while (len!=0){
            int n = i.indexOf("n");
            if(n==-1)
                break;
            count++;
            i = i.substring(n+1);
            len=i.length();
        }
        System.out.println(count);
    }
}
