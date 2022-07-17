package com.iweb.输入流;

import java.io.*;

//字节缓冲流 一次读8kB进入缓存 然后我们从缓存中哪数据
//BufferedInputStream
public class T6 {
    public static void main(String[] args) {
        InputStream is=null;
        BufferedInputStream bis=null;
        int count=0;
        try {
             is=new FileInputStream("E:\\ar_java\\ch7-21\\src\\com\\iweb\\输入流\\T4.java");
             bis=new BufferedInputStream(is);
            int i;
            while ((i=bis.read())!=-1){
                System.out.print((char)i );
                 count++;
            }
            System.out.println("一共有"+count+"个字节");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {

                if (bis!=null)
                    bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
