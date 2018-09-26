package com.zereao.proxy.demo01.dynamic.demo01;

/**
 * @author Zereao
 * @version 2018/09/26  11:18
 */
public class BeforeAdvice implements IAdvice {
    @Override
    public void exec() {
        System.out.println("前置通知");
    }
}
