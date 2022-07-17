package com.iweb.类存储器;
//this关键字
public class Leaf {
    public static void main(String[] args) {
        Leaf leaf=new Leaf(100);
        leaf.increament().increament().print();
    }
    int i=0;

    public Leaf(int i) {
        this.i = i;
    }

    public Leaf() {
    }

    Leaf increament(){
        this.i++;
        return this;
    }

    void  print(){
        System.out.println("i="+this.i);
    }
}
