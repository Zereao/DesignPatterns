package com.zereao.bridge.demo02;

/**
 * @author Zereao
 * @version 2018/09/17  11:31
 */
public abstract class AbstractProduct {
    // 不管是什么产品总要能被生产出来
    public abstract void beProducted();

    // 生产出的东西，一定能被销售
    public abstract void beSelled();
}
