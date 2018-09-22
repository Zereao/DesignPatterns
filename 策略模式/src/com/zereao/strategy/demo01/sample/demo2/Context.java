package com.zereao.strategy.demo01.sample.demo2;

/**
 * @author Zereao
 * @version 2018/09/22  22:05
 */
public class Context {
    private Calculator calculator = null;

    public Context(Calculator calculator) {
        this.calculator = calculator;
    }

    public int exec(int a, int b) {
        return this.calculator.exec(a, b);
    }
}
