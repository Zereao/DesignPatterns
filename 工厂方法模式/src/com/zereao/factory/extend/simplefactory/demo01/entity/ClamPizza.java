package com.zereao.factory.extend.simplefactory.demo01.entity;


import com.zereao.factory.extend.simplefactory.demo01.Pizza;

/**
 * @author Zereao
 * @version 2018/07/11  9:59
 */
public class ClamPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("prepare ClamPizza...");
    }

    @Override
    public void bake() {
        System.out.println("bake ClamPizza...");
    }

    @Override
    public void cut() {
        System.out.println("cut ClamPizza...");
    }

    @Override
    public void box() {
        System.out.println("box ClamPizza...");
    }
}
