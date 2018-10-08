package com.zereao.strategy.demo02;

/**
 * @author Zereao
 * @version 2018/10/08  21:57
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
