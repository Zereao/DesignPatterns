package com.zereao.demo01.beverage;

import com.zereao.demo01.AbstractBeverage;

/**
 * @author Zereao
 * @version 2018/09/13  17:06
 */
public class Decat extends AbstractBeverage {
    public Decat() {
        description = "Decat";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
