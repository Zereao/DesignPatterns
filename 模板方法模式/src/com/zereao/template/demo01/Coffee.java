package com.zereao.template.demo01;

/**
 * @author Zereao
 * @version 2018/09/21  15:45
 */
public class Coffee extends AbstractBeverage {
    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter...");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Sugar and Milk...");
    }
}
