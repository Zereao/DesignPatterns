package com.zereao.factory.extend.simplefactory.demo01.entity;


import com.zereao.factory.extend.simplefactory.demo01.Pizza;

/**
 * @author Zereao
 * @version 2018/07/11  10:08
 */
public class PepperoniPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("prepare PepperoniPizza...");
    }

    @Override
    public void bake() {
        System.out.println("bake PepperoniPizza...");
    }

    @Override
    public void cut() {
        System.out.println("cut PepperoniPizza...");
    }

    @Override
    public void box() {
        System.out.println("box PepperoniPizza...");
    }
}
