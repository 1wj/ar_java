package com.iweb.hw;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 1、统计一个文件calcCharNum.txt(创建一个文件，里面写各种字母)中字母'A'和'a'出现的总次数
 */
public class hw1 {
    public static void main(String[] args) {
        BufferedReader br=null;
        int count=0;
        try {
            br=new BufferedReader(new FileReader("E:/calcCharNum.txt"));
            int i;
            while((i=br.read())!=-1){

                if((char)i=='a'|| (char)i=='A')
                    count++;
            }
            System.out.println(count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(br!=null)
                    br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
