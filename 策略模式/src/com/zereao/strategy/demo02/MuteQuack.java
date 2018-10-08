package com.zereao.strategy.demo02;

/**
 * @author Zereao
 * @version 2018/10/08  22:00
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
