package com.iweb.Socket;

import java.io.*;
import java.net.Socket;

public class TestClient {
    public static void main(String[] args) {
        Socket s=null;
        DataOutputStream dos=null;
        DataInputStream dis=null;
        try {
            s=new Socket("127.0.0.1",9527);

            dos=new DataOutputStream(s.getOutputStream());
            dos.writeUTF("hello server!");

            dis=new DataInputStream(s.getInputStream());
            System.out.println(dis.readUTF());


        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(dos!=null){
                    dos.flush();
                    dos.close();
                }
                if(s!=null){
                    s.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
