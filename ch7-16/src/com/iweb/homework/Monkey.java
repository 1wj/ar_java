package com.iweb.homework;

/**
 * 4、编写Java应用程序，该程序包括3个类：Monkey类、People类和测试类Test。要求：
 * ① Monkey类中有个public void speak()方法，在speak方法中输出“咿咿呀呀......”的信息。
 * ②People类是Monkey类的子类，在People类中重写方法speak(),在speak方法中输出“小样的，不错嘛！会说话了！”的信息。
 * ③在People类中新增方法void think()，在think方法中输出“别说话！认真思考！”的信息。
 * ④在测试类Test的main方法中创建Monkey与People类的对象类测试这2个类的功能。
 */
public class Monkey {
    public void speak(){
        System.out.println("咿咿呀呀");
    }
}
