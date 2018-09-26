package com.zereao.proxy.demo01.dynamic.demo01;

import java.lang.reflect.InvocationHandler;
import java.util.List;

/**
 * @author Zereao
 * @version 2018/09/26  11:21
 */
public class Main {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        InvocationHandler invocationHandler = new MyInvocationHandler(subject);
        Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(),
                subject.getClass().getInterfaces(), invocationHandler);
        proxy.doSomething("Finish");
    }
}
