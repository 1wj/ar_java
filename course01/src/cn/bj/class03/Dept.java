package cn.bj.class03;

//设计模式中单例模式的懒汉式  采取的是懒加载模式 线程不安全 会发生改变
public class Dept {
    //volatile
    private static Dept d=null;
    private Dept(){

    }
    private static Dept getDept(){
        if (d==null){
            return d=new Dept();
        }
        return d;
    }
}
