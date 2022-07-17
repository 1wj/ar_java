package com.iweb.输入流;

import java.io.*;

//字符缓冲流  从这开始有读一行的，写一个字符串的，打印流也有，前面的没有
//BufferedReader  BufferedWriter
public class T7 {
    public static void main(String[] args) {
        FileReader fr=null;
        FileWriter fw=null;
        BufferedReader br=null;
        BufferedWriter bw=null;
        try {
            fw=new FileWriter("E:/mynum.txt");
            fr=new FileReader("E:/mynum.txt");
            br=new BufferedReader(fr);
            bw=new BufferedWriter(fw);
            for (int i = 0; i < 100; i++) {
                String s=String.valueOf(Math.random());
                bw.write(s);
                bw.newLine();
            }
            bw.flush();

            //读
            String str=null;
            while((str=br.readLine())!=null){
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

                try {
                    if (br!=null) {
                        br.close();
                    }
                    if (bw!=null) {
                        bw.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
               }
            }
        }

    }

