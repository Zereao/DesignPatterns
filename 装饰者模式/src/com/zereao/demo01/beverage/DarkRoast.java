package com.zereao.demo01.beverage;

import com.zereao.demo01.AbstractBeverage;

/**
 * @author Zereao
 * @version 2018/09/13  17:04
 */
public class DarkRoast extends AbstractBeverage {
    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
