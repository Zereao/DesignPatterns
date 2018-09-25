package com.zereao.factory.extend.simplefactory.demo01.entity;


import com.zereao.factory.extend.simplefactory.demo01.Pizza;

/**
 * @author Zereao
 * @version 2018/07/10  15:25
 */
public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("prepare CheesePizza...");
    }

    @Override
    public void bake() {
        System.out.println("bake CheesePizza...");
    }

    @Override
    public void cut() {
        System.out.println("cut CheesePizza...");
    }

    @Override
    public void box() {
        System.out.println("box CheesePizza...");
    }
}
