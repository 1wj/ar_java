package com.iweb.Objct类;

public class T2 {
    public static void main(String[] args) {
      /*  Person p=new Person();
        System.out.println(p);*/

        Person p=new Student();
        p.setB("张三");
        p.setI(10);
        Person p2=new Person();

        if(p instanceof Student){
            Student s2=(Student) p;
            s2.setSchool("南信大");
            System.out.println(s2.getSchool());
        }
     //   p.setSchool("南信大");
       // System.out.println(p);

        Student s3= new Student();
        System.out.println(p2 instanceof Person);

        System.out.println(s3 instanceof Student);
        System.out.println(s3 instanceof  Person);

        System.out.println(p instanceof  Person);
        System.out.println(p instanceof  Student);
        System.out.println(p2 instanceof  Student);

    }
}
