package com.iweb.homework;

/**
 * 设计一个抽象类，描述门Door，那么对于这张门来说，就应该拥有所有门的共性，
 * 开门openDoor()和关门closeDoor()；
 * 然后对不同种类的门进行额外的功能设计,
 * 例如防盗--theftproof()、防水--waterproof()、防弹--bulletproof()、防火、防锈……
 * 要求：利用继承、抽象类知识设计该门
 */
public abstract class  Door {
    public abstract void openDoor();
    public abstract void closeDoor();

}
