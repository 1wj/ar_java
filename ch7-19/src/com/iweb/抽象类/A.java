package com.iweb.抽象类;

import com.iweb.接口.Signer;

public abstract class A implements Signer{
    abstract void f();
    final void s(){
    };

    @Override
    public void sing() {

    }
}
