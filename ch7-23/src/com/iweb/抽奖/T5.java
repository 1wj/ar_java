package com.iweb.抽奖;

public class T5 {
    public static void main(String[] args) {
        //创建一个抽奖器类的对象，指定数据类型
        Prodeuct pro=new Prodeuct();
        Object [] arr=new Object[]{"苹果手机","华为手机",2000+"元",100+"元",10000+"元","咖啡机"};
        //将物品数组添加到抽奖器中
        for (Object s:arr) {
            pro.addPro(s);
        }
       //抽奖
        Object prod=pro.getPro();
        System.out.println("恭喜你抽中了"+prod);
    }
}
