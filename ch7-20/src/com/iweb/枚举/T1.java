package com.iweb.枚举;

public class T1 {
     enum MyColor{
        red,green,blue;
    }

    public static void main(String[] args) {
        MyColor color=MyColor.green;
        switch(color){
            case red:
                System.out.println("红色");
                break;
            case green:
                System.out.println("绿色");
                break;
            case blue:
                System.out.println("蓝色");
                break;
            default:
                System.out.println("都不是");
                break;

        }

    }
}
