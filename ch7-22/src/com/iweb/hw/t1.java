package com.iweb.hw;

import java.io.*;
import java.util.Date;

public class t1 {
    public static void main(String[] args) {
        BufferedReader br=null;
        BufferedWriter bw=null;
        PrintWriter pw=null;
        int count=0;

        try {
            br=new BufferedReader(new InputStreamReader(System.in));
            pw=new PrintWriter(new FileWriter("E:/T3.txt",true));
            String str=null;
            while ((str=br.readLine())!=null){
                if("exit".equals(str))
                    break;
                pw.println(str);
                char[] chars = str.toCharArray();
                for (int i = 0; i < chars.length; i++) {
                    if(chars[i]=='a'||chars[i]=='A' )
                        count++;
                }
            }
            pw.write("--------"+new Date() +"-------");
            pw.println("\n");
            pw.flush();

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
