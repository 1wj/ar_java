package cn.bj.class05;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

public class stringFangFa {
    public static void main(String[] args) {
        String s="";
        System.out.println(s.isEmpty());

        String s1="abc";
        System.out.println(s1.charAt(1));//获取字符串指定下标的字符

        //比较左边是否与右边有关
       /* if (Object instanceof String) {
            String anotherString = (String)Object;
        }*/

        //忽略大小写
        String s2="abc";
        System.out.println(s1.equalsIgnoreCase(s2));

        //大串找小串
        String big="abcabc";
        String small="ab";
        System.out.println(big.indexOf(small));


        //截取
        String s4="abcdefg";
        String substring = s4.substring(2);
        String substring2 = s4.substring(2,4);
        //substring 表示截取 但在截取时 左包含 右不包含 sublen=endIndex-beginIndex
        //所以 其实就是从beginIndex 开始截取sublen个长度的字符串进行返回            [)
        System.out.println(substring2);


        //切割  split  正则表达式 要传入一个依据
        String test="hello world";
        String[] s3 = test.split(" ");
       System.out.println(Arrays.toString(s3));

        //变成字符数组
         //toCharArray()

       //大小写转化 汉字除外
      String s5="ABD";
        String s6 = s5.toLowerCase(Locale.ROOT);
        System.out.println(s6);

        //intern（） 作用： 当我们添加一个新的字符串的时候，它会去常量池中 用equals比较一下
        //是否有相同的字符串 如果有 那么久将原来的那个字符串的引用返回回去
        //如果没有 就创建一个新的引用返回回去


    }
}
