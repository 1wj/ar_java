package com.iweb.Socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
//记住都是从输入流读 往输出流写就行了，  Data是处理流里面传个  s.getInputStream /s.getOutputStream
public class TestSocket {
    public static void main(String[] args) {
        ServerSocket ss=null;
        Socket s=null;

        DataInputStream dis=null;//一个处理流
        DataOutputStream dos=null;

        try {
            ss=new ServerSocket(9527);
          while (true){
              s=ss.accept();//服务端接收到客服端的访问

              dis=new DataInputStream(s.getInputStream());//相当于自己（服务端）的输入流
              System.out.println(dis.readUTF());//以utf-8的编码格式读取数据

              dos=new DataOutputStream(s.getOutputStream());
              dos.writeUTF("客户端你好，我接收到了请求");

          }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

                try {
                    if (dis!=null)
                    dis.close();
                    if (ss!=null);
                    ss.close();
                    if (s!=null);
                    s.close();
                } catch (IOException e) {
                    e.printStackTrace();

            }
        }
    }
}
