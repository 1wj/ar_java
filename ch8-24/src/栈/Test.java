package 栈;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        int n=100;
        //实现进制转换 十 --》 二
        int t=n;//被除数
        //创建一个栈
        Stack stack=new Stack();
        do {
            //除以2求余数
            int mod=t%2;
            //入栈
            stack.push(mod);
            //输出余数
            System.out.println(mod);
            //除以2得到商
            t=t/2;

        }while (t>0);
        System.out.print(n+"------------->");
        while (!stack.isEmpty()){//栈非空
            System.out.print(stack.pop());
        }
    }
}
