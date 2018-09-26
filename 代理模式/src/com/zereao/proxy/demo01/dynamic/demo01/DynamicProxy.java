package com.zereao.proxy.demo01.dynamic.demo01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author Zereao
 * @version 2018/09/26  11:15
 */
public class DynamicProxy<T> {
    @SuppressWarnings("unchecked")
    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler handler) {
        // 寻找JoninPoint 连接点，AOP 框架使用元数据定义 ？？？
        //noinspection ConstantConditions
        if (true) {
            // 在某条件下，执行前置通知
            new BeforeAdvice().exec();
        }
        // 执行完目标，并返回结果
        return (T) Proxy.newProxyInstance(loader, interfaces, handler);
    }

    /**
     * 这样扩展，该类就具有的业务意义
     */
    public static <T> T newProxyInstance(Subject subject) {
        Class clz = subject.getClass();
        ClassLoader loader = clz.getClassLoader();
        Class<?>[] interfaces = clz.getInterfaces();
        InvocationHandler handler = new MyInvocationHandler(subject);
        return newProxyInstance(loader, interfaces, handler);
    }
}
