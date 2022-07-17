package com.iweb.加密;

import org.apache.commons.codec.digest.DigestUtils;


//加密算法 MD5  和 sha256
public class T3 {
    public static void main(String[] args) {
        //md5
        String s1="hello";
         s1 = DigestUtils.md5Hex(s1);
        System.out.println(s1);
        String s2="hello";
        s2=DigestUtils.md5Hex(s2);
        System.out.println(s2);
        //sha256
        String s3="hello";
        s3 = DigestUtils.sha256Hex(s3);
        System.out.println(s3);
        String s4="hello";
        s4 = DigestUtils.sha256Hex(s4);
        System.out.println(s4);
    }
}
