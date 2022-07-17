package com.iweb.文件类;

import javax.jws.soap.SOAPBinding;
import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;

public class MyFile {
    public static void main(String[] args) {
        String path="F:\\mydir\\mydir2\\mydir3";
        String fileName="1.txt";
        File file=new File(path,fileName);
        if(file.exists()){
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getName());
            System.out.println(file.length());
        }else {
            try {
                System.out.println("正在创建路径");
                //在当前包目录下创建一个路径
                //为了防止 你在创建文件的时候，避免其文件所在的 文件夹 不存在，然后抛出异常
                file.getParentFile().mkdir();
                //在硬盘上加入文件
                file.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
