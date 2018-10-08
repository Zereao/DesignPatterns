package com.zereao.strategy.demo02;

/**
 * @author Zereao
 * @version 2018/10/08  22:01
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
