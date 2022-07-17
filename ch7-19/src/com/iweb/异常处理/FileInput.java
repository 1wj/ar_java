package com.iweb.异常处理;

import java.io.FileInputStream;

import java.io.IOException;

public class FileInput {
    public static void main(String[] args) {
        FileInputStream fis =null;  //文件输入字节流
        try {
            fis=new FileInputStream("E:\\ar_java\\ch7-19\\src\\com\\iweb\\异常处理\\FileInput.java");
            int i;
            while((i=fis.read())!=-1){
                System.out.print((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
