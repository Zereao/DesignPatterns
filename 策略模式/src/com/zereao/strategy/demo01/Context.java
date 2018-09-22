package com.zereao.strategy.demo01;

/**
 * 所谓锦囊
 *
 * @author Zereao
 * @version 2018/09/22  21:19
 */
public class Context {
    private IStrategy strategy;

    // 构造函数，决定需要使用哪个妙计
    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    //　使用计谋，出招
    public void operate() {
        this.strategy.operate();
    }
}
