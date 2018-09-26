package com.zereao.abstractfactory.demo02.human;

/**
 * 抽象人种-黑色人种
 *
 * @author Zereao
 * @version 2018/07/25  10:27
 */
public abstract class AbstractBlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黑人");
    }

    @Override
    public void talk() {
        System.out.println("黑人一般说英语");
    }
}
