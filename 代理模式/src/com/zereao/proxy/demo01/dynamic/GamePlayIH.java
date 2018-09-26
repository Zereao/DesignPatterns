package com.zereao.proxy.demo01.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * InvocationHandler 是JDK提供的动态代理接口，对被代理类的方法进行代理
 *
 * @author Zereao
 * @version 2018/09/26  10:44
 */
public class GamePlayIH implements InvocationHandler {
    // 被代理这
    Class cls = null;
    //　被代理的实例
    Object obj = null;

    /**
     * 我要代理谁
     */
    public GamePlayIH(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.obj, args);
        if ("upgrade".equalsIgnoreCase(method.getName())) {
            System.out.println("升级成功！");
        }
        return result;
    }
}
