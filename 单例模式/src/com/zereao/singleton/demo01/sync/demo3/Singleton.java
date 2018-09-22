package com.zereao.singleton.demo01.sync.demo3;

/**
 * 方案三、 用“双重检查加锁”，在getInstance()中减少使用同步。
 *
 * @author Zereao
 * @version 2018/09/14  21:34
 */
public class Singleton {
    /*
     * 利用静态变量来记录Singleton的唯一实例
     * volatile 关键字确保：当uniqueInstance变量被初始化成Singleton实例时，
     * 多个线程正确地处理uniqueInstance变量
     */
    private volatile static Singleton uniqueInstance;

    /*
     * 构造器私有化，只有Singleton类内才可以调用构造器
     */
    private Singleton() { }

    /*
     * 检查实例，如果不存在，就进入同步区域
     */
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            // 进入同步区域
            synchronized (Singleton.class) {
                // 在检查一次，如果为null，则创建
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}