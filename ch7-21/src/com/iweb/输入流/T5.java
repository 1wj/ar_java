package com.iweb.输入流;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

//Writer FileWriter
public class T5 {
    public static void main(String[] args) {
        Writer writer=null;
        try {
            writer=new FileWriter("E:/myunicode.txt");
            for (int i = 1; i < 50000; i++) {
                writer.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(writer!=null){
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        }

    }
