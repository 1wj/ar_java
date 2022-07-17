package com.iweb.面向对象;

public class Test3 {
    public static void main(String[] args) {
        Animal cat=new Cat("tom","blue");
        Animal dog=new Dog("大黄","yellow");
       /* Animal bird=new Bird("pello","red");
        f(cat);
        f(dog);
        f(bird);*/

        Lady l1=new Lady("小红",cat);
        l1.mypetEnjoy();
        Lady l2=new Lady("小张",dog);
        l2.mypetEnjoy();
    }
    static void f(Animal a){
        if(a instanceof Cat){
            Cat c=(Cat)a;
            System.out.println(c.getName()+","+c.getEyesColor());
        }
        if(a instanceof Dog){
            Dog d=(Dog)a;
            System.out.println(d.getName()+","+d.getFurColor());
        }
        if(a instanceof Bird){
            Bird d=(Bird)a;
            System.out.println(d.getName()+","+d.getBirdColor());
        }


    }
}
