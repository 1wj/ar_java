package cn.bj.class05;

public class stringbufferFangfa {
    public static void main(String[] args) {
        /**
         * 主要是string 不能被修改  才需要stringbuffer和stringbuilder
         * 所有字符串的拼接都在缓冲区做的
         *  StringBuffer：可变数组   主要为了维护一个缓冲区 一般在堆中
         *  StringBuilder :和StringBuffer一摸一样  唯一区别：是线程不安全
         */
        String ss="dfs"+"df";
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer s = stringBuffer.append("s");
      //  stringBuffer.toString();
        String s1 = s.toString();  //将s从堆中放入常量池
        System.out.println(s);
    }
}
