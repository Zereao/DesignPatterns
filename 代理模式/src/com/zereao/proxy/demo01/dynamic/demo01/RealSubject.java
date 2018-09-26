package com.zereao.proxy.demo01.dynamic.demo01;

/**
 * @author Zereao
 * @version 2018/09/26  11:12
 */
public class RealSubject implements Subject {
    @Override
    public void doSomething(String str) {
        System.out.println("doSomething " + str);
    }
}
