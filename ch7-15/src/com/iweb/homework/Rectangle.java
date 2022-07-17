package com.iweb.homework;

/**
 * 4、定义长方形类，含：
 *   属性：宽、高（整型）；
 *   方法：求周长、面积；
 *   构造方法3个：
 * 	（1）无参——宽、高默认值为1；
 * 	（2）1个参数——宽、高均为参数值；
 * 	（3）2个参数——宽、高各为参数值。
 * 编写测试类：进行测试。
 */
public class Rectangle {
    int height;
    int width;
    public Rectangle(){
        this.height=1;
        this.width=1;
    }
    public Rectangle(int height){
        this.height=height;
        this.width=height;
    }
    public Rectangle(int height,int width){
        this.height=height;
        this.width=width;
    }
    public int  getSum(){
        return 2*(height+width);
    }
    public int  getArea(){
        return height*width;
    }
}
