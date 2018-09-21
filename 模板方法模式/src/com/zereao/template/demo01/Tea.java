package com.zereao.template.demo01;

/**
 * @author Zereao
 * @version 2018/09/21  15:48
 */
public class Tea extends AbstractBeverage {
    @Override
    public void brew() {
        System.out.println("Steeping the tea...");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon...");
    }
}
