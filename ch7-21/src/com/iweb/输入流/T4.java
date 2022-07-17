package com.iweb.输入流;

import java.io.*;
//Reader FileReader
public class T4 {
    public static void main(String[] args) {
        Reader reader=null;
        int count=0;
        try {
            reader=new FileReader("E:\\ar_java\\ch7-21\\src\\com/iweb/输入流\\T4.java");
            int i;
            while ((i=reader.read())!=-1){
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
                if(reader!=null)
                    reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
}
