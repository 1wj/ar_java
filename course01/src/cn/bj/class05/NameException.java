package cn.bj.class05;

//自定义异常
public class NameException extends RuntimeException{
    public NameException() {
        super();
    }

    public NameException(String message) {
        super(message);
    }
}
