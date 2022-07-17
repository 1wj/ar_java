package 链表;

public class Test {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(1234567);
        list.add(1234567);
        list.add(1234567);
        list.add(6,66);
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println(list.get(9));
        System.out.println(list.toString());//全类名@哈希编码
    }
}
