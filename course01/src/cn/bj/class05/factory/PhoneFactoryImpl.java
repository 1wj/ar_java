package cn.bj.class05.factory;

public class PhoneFactoryImpl extends PhoneFactory{
    @Override
    public Phone createPhone(String name) {
        if ("oppo".equals(name)){
           return new Oppo();
        }
       else
           return new XiaoMi();
    }
}
