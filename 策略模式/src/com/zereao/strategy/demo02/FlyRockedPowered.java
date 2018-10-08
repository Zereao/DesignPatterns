package com.zereao.strategy.demo02;

/**
 * @author Zereao
 * @version 2018/10/08  22:10
 */
public class FlyRockedPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
