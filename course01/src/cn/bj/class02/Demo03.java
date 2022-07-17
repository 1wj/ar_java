package cn.bj.class02;

//java内存
public class Demo03 {
    public static void main(String[] args) {
        //jvm:堆 本地方法栈（底层方法执行的 native） 虚拟机栈（自己写的方法执行的） 程序计数器 云空间（方法区 永久代）
        //静态方法和类同级 用类名调用
        /**
         * static 静态关键字
         * 可以修饰变量 作为一个静态变量 也可以修饰方法作为一个静态方法
         * 静态方法只能被静态方法调用 调用的时候 直接类名.方法名
         *  垃圾清理：优先加载 gcroots 可达性分析算法 或 Object的finalize()方法
         * 输出了引用
         * 静态代码块
         *    在类加载的过程中 优先级是最高的
         *
         * 一个.class 可以有多个类 但只能有一个 public 类
         *
         * 对象（引用）的等级 ：强（new 对象）软弱虚
         */
        Test t=new Test();
        //根据参数，自动选择调用的方法
        int sum1=t.sum(1,2);
        int sum2=t.sum(1,2,3);
        int sum3=t.sum(1,2,3,4);


    }
}
class Test{
    //重载 overload  静态方法没有重载 它与类同级 而重载的在同一个类中
    //两同三不同:方法名相同 同一个类
    //         一个不同：参数列表不同-->三个不同：参数的类型，顺序，个数
    //与返回值类型无关

    public  int sum(int a,int b){
        return a+b;
    }

    public  int sum(int a,int b,int c){
        return a+b+c;
    }

    public  int sum(int a,int b,int c,int d){
        return a+b+c+d;
    }
}












