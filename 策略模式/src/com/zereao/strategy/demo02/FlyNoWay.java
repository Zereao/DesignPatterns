package com.zereao.strategy.demo02;

/**
 * @author Zereao
 * @version 2018/10/08  21:58
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly!!!");
    }
}
