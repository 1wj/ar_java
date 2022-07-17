package cn.bj.class05;

public class throwing {
    public static void main(String[] args) throws Exception {
        /**
         * 异常：
         *    Throwable 异常的顶级类
         *  execption: 跟代码相关的异常  编译异常  运行异常等等
         *  error: 虚拟机的硬件异常 堆 栈。。出了问题  内存溢出 内存泄漏
         */
        /**
         * 处理异常的两种方式 try catch 和 throws(在方法声明上) 一般不会在main方法上抛出异常
         * 子类抛出的异常不能超过父类抛出的异常
         * RuntimeException 和它的子类在  子类和父类抛出时相当于同级  除外
         * 除了RuntimeException异常其他的异常抛出时必须是
         *              子类抛出的异常不能超过父类抛出的异常
         */
        int a=3;
        int b=0;
        try{
            System.out.println(a/b);
            //return;
        }catch (Exception e){
            System.out.println("解决异常");
            e.printStackTrace();//打印异常详情
          //  return;//那怕有return 后面的finally也执行
        }finally {
            //一定会执行的代码块无论上面是否有return
            System.out.println("finally");
        }

    }
}
