package cn.bj.class05;

import java.util.HashMap;

public class Demo02 {
    public static void main(String[] args) {
        /**
         * 常用系统类
         *  1.Object：
         *   hashCode()：一般比较对象不相等 作用：比较对象不相等的依据 一般和equals连用
         *   地址值：对象首次进入内存拿到的地址（引用）
         *   地址：会变的
         *   比较方法：
         *     ==：比较运算符
         *       比较基本数据类型和引用数据类型
         *              值            是否为同一个引用（是否为同一个对象）
         *     equals:
         *         是object类下的一个方法
         *         所以只能比较引用数据类型
         *           是否重写：如果子类重写了equals方法
         *           比较的是属性值是否相等
         *           如果没有重写 比较的是引用 因为在Object里面的实现放式基于==比较
         *     hashCode():比较对象是否不相等
         *
         *     如果要是谈比较 基本都是先hashcode再equals
         *     toString():将对象变成字符串 重写后 变成属性
         *
         *     垃圾回收
         *     可达
         *     GCROOTS                          两次回收分析的算法
         *     可达性分析算法   第一次分析不会回收 （GCROOTS链）
         *                    第二次分析会回收   （finalize()）
         *  2.String 字符串 通过什么对象维护串联的行为？
         *           容器：数组
         *      已知：字符串是一个常量值 不可改变
         */
        /**
         * static final int hash(Object key) {
         *         int h;
         *         return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
         *         int 的高低16位做异或操作
         *     }
         *
         *     “”:空串
         *     NULL: 空  null是值不是对象 “”是对象 表示空字符串
         *     对象可以调用方法  值不行
         *
         *     多看看String和HashMap源码
         */
        String s = new String();
        System.out.println("=="+s);
    }
}
