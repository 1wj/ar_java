package 链表;

public interface List {
    int size();
    Object get(int i);
    boolean isEmpty();
    boolean contains(Object object);
    int indexOf(Object object);
    void add(int i,Object e);
    void add(Object o);
    boolean addBefore(Object obj,Object e);
    boolean addAfter(Object obj,Object e);
    Object remove(int i);
    boolean remove(Object e);
    Object replace(int i,Object e);


}
