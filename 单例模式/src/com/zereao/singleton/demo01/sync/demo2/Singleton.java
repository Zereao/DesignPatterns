package com.zereao.singleton.demo01.sync.demo2;

/**
 * 方案二、 直接初始化静态变量。这样就保证了线程安全。
 *
 * @author Zereao
 * @version 2018/09/14  21:32
 */
public class Singleton {
    /*
     * 利用静态变量来记录Singleton的唯一实例
     * 直接初始化静态变量，这样就可以确保线程安全了
     */
    private static Singleton uniqueInstance = new Singleton();

    /*
     * 构造器私有化，只有Singleton类内才可以调用构造器
     */
    private Singleton() { }

    public static Singleton getInstance() {
        return uniqueInstance;
    }
}