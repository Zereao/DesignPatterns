package com.zereao.proxy.demo01.dynamic.demo01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Zereao
 * @version 2018/09/26  11:13
 */
public class MyInvocationHandler implements InvocationHandler {
    // 被代理对象
    private Object target;

    // 通过构造函数传递一个对象
    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.target, args);
    }
}
