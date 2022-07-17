package com.iweb.输入流;

import java.io.*;
import java.util.Date;
//打印流
public class T8 {
    public static void main(String[] args) {
        String s=null;
        PrintWriter pw=null;//打印流 是一个包装流
        BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
        try {
            FileWriter fw=new FileWriter("E:/log.txt",true);//这是一个节点流
            pw=new PrintWriter(fw);
            while ((s=br.readLine())!=null){//读一行
                if("exit".equals(s))
                    break;
                System.out.println(s);
                pw.println(s);//写一行
            }

            pw.println("================"+new Date() +"==================");
            pw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (pw!=null){
                    pw.close();
                }
                if (br!=null){
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
