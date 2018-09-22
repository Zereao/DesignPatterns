package com.zereao.strategy.demo01.sample.demo2;

/**
 * @author Zereao
 * @version 2018/09/22  22:04
 */
public class Add implements Calculator {
    @Override
    public int exec(int a, int b) {
        return a + b;
    }
}
