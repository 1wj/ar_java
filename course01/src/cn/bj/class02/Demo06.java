package cn.bj.class02;

public class Demo06 {
    public static void main(String[] args) {
        /**
         * 数组：是一个存储相同数据类型的一个容器 长度是固定的
         * 特点：
         *      地址值是连续的
         *      机结构会给他分配一个下标
         *      只能存相同的数据类型的数据
         *      长度不可更改
         * 优点：查询块
         * 缺点：增删慢
         *        数据的地址是连续的 连续的内存空间
         *        增删会破话数组的结构
         *        数组的长度是固定的 增删其实就是创建一个新的数组
         * 延伸
         *        {1,2，“abc”,false}
         *        Object [] arr={1,2，“abc”,false};才能放的进去
         */
        int [] arr;//数组对象的声明
        int [] arr1;//数组对象的声明
        //静态初始化 和 动态初试化
        //静态初始化 给值 不给长度 由系统计算长度
        arr= new int []{1,3,2,4,5};
        //动态初始化 给长度 系统给默认值
        arr1=new int [5];//{0,0,0,0,0}
        //数组的赋值
        arr1[0]=1;
        arr1[1]=1;
        arr1[2]=1;
        arr1[3]=1;
        arr1[4]=1;
        //数组的遍历
       /* for (int i = 0; i <arr1.length ; i++) {
            System.out.println(arr1[i]);
        }
        //增强版for foreach i是指对象的每个实例
        for(int i:arr1){
            System.out.println(i);
        }*/
        //冒泡
       /* int temp=0;
        int [] arr2={11,15,2,3,5,1,18,21};
        boolean flag;
        for (int i=1;i<arr2.length-1;i++){
            flag=true;
            for (int j = 0; j < arr2.length-i-1 ; j++) {
                if (arr2[j]>arr2[j+1]){
                    temp=arr2[j];
                    arr2[j]=arr2[j+1];
                    arr2[j+1]=temp;
                    flag=false;
                }
            }
            if (flag==true){
                break;
            }

        }
        for (int i :arr2) {
            System.out.println(i);
        }*/
        //选择排序
        int [] arr3={11,15,95,3,5,1,18,221};
        for (int i = 0; i <arr3.length-1 ; i++) {
            int min=i,  temp;
            for (int j = i+1; j <arr3.length  ; j++) {
                if (arr3[min]>arr3[j]){
                    min=j;
                }
            }
            if (min!=i){
                temp=arr3[i];
                arr3[i]=arr3[min];
                arr3[min]=temp;
            }
        }
        for (int i :arr3) {
            System.out.println(i);
        }

//插入 希尔 快排
    }
}
