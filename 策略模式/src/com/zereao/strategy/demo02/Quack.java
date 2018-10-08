package com.zereao.strategy.demo02;

/**
 * @author Zereao
 * @version 2018/10/08  22:00
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
