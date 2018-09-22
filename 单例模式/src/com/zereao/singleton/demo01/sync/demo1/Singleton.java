package com.zereao.singleton.demo01.sync.demo1;

/**
 * 方案一：使用synchronized来处理。也就是说将getInstance()方法变成同步方法即可
 *
 * @author Zereao
 * @version 2018/09/14  21:29
 */
public class Singleton {
    //利用静态变量来记录Singleton的唯一实例
    private static Singleton uniqueInstance;

    /*
     * 构造器私有化，只有Singleton类内才可以调用构造器
     */
    private Singleton() { }

    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}