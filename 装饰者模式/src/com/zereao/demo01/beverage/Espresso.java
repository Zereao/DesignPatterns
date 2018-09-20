package com.zereao.demo01.beverage;

import com.zereao.demo01.AbstractBeverage;

/**
 * @author Zereao
 * @version 2018/09/13  17:05
 */
public class Espresso extends AbstractBeverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.85;
    }
}
