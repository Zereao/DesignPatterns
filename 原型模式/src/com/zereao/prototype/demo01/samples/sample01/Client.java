package com.zereao.prototype.demo01.samples.sample01;

/**
 * 简单的场景类，用于测试
 *
 * @author Zereao
 * @version 2018/09/22  17:53
 */
public class Client {
    public static void main(String[] args) {
        // 产生一个对象
        Thing thing = new Thing();
        // 拷贝一个对象，此时不会再执行构造函数
        Thing cloneThing = thing.clone();
    }
}
