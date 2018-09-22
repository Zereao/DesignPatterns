package com.zereao.singleton.demo01;

/**
 * @author Zereao
 * @version 2018/09/14  21:01
 */
public class MyClass {
    private MyClass() { }

    public static MyClass getInstance() {
        return new MyClass();
    }
}
