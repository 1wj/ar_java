package 链表;

import java.util.Arrays;

/*
    顺序表底层用的是数组，但是长度可以动态的变化

 */
public class ArrayList implements List{

    private Object[] elementData;//底层是一个数组，目前未初始化
    private  int  size;//不是数组分配了几个空间，而是元素的个数

    public ArrayList() {
        //没有指定长度，默认是4
        this(4);
    }

    public ArrayList(int init) {
        //给数组分配指定数量的空间
        elementData=new Object[init];

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int i) {
        if(i<0 ||i>=size){
            throw new IndexOutOfBoundsException("数组索引越界异常"+i);
        }
        return elementData[i];
    }

    @Override
    public boolean isEmpty() {
      return size==0;
    }

    @Override
    public boolean contains(Object object) {
        return false;
    }

    @Override
    public int indexOf(Object object) {
        return 0;
    }

    @Override
    public void add(int i, Object e) {
        if(i<0 || i>size){
            throw new RuntimeException("数组索引越界"+i);
        }
        //后移元素，从最后一个元素开始
        for (int j = size; j >i ; j--) {
            elementData[j]=elementData[j-1];        //这边要考虑一下j还是j+1
        }
       elementData[i]=e;
        size++;
        if(size==elementData.length){
            grow();
        }
    }

    @Override
    public void add(Object o) {
      this.add(size,o);
    }

    private void grow(){
        elementData=Arrays.copyOf(elementData,elementData.length*2);
    }

    @Override
    public boolean addBefore(Object obj, Object e) {
        return false;
    }

    @Override
    public boolean addAfter(Object obj, Object e) {
        return false;
    }

    @Override
    public Object remove(int i) {
        return null;
    }

    @Override
    public boolean remove(Object e) {
        return false;
    }

    @Override
    public Object replace(int i, Object e) {
        return null;
    }

    public String toString(){
        if(size==0)
            return "[]";
        StringBuffer sb=new StringBuffer("[");
        for (int i = 0; i < size; i++) {
            sb.append(elementData[i]).append(",");
        }
        sb.deleteCharAt(sb.length()-1);
        sb.append("]");
        return sb.toString();
    }

}
