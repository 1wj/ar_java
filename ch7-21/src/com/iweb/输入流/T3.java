package com.iweb.输入流;

import java.io.*;
//FileOutputStream  FileInputStream
public class T3 {
    public static void main(String[] args) {
        InputStream is=null;
        OutputStream os=null;
        //String path= File.separator;
        int count=0;
        try {
           // is=new FileInputStream("F:"+path+"mydirR"+path+"mydir2"+path+"mydir3"+path+"1.txt");
            is=new FileInputStream("E:\\ar_java\\ch7-21\\src\\com\\iweb\\输入流\\T3.java");
            //智能的idea会自动把 \ 替换成 /
            os=new FileOutputStream("E:/T3.java");
            //如果文件不存在，则先自动创建
            int i;
            while ((i=is.read())!=-1){
                System.out.print((char)i );
                os.write(i);//直接往文件里一个字节一个字节的写
                count++;
            }
            System.out.println("一共有"+count+"个字节");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(is!=null)
                    is.close();
                if (os != null)
                    os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
