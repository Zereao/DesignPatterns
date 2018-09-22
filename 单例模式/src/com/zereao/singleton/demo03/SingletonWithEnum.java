package com.zereao.singleton.demo03;

/**
 * 使用枚举实现的单例模式
 *
 * @author Zereao
 * @version 2018/09/21  23:23
 */
public class SingletonWithEnum {
    private enum Singleton {
        INSTANCE;
        private SingletonWithEnum singletonWithEnum;

        private Singleton() {
            singletonWithEnum = new SingletonWithEnum();
        }
    }

    public SingletonWithEnum getInstance() {
        return Singleton.INSTANCE.singletonWithEnum;
    }
}
