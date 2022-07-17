package cn.bj.class05.factory;

public abstract class PhoneFactory {
    //让放回的实例 变成引用 用抽象
    public abstract Phone createPhone(String name);
}
