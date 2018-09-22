package com.zereao.decorator.demo01.beverage;

import com.zereao.decorator.demo01.AbstractBeverage;

/**
 * 四个组件之一
 *
 * @author Zereao
 * @version 2018/09/13  16:57
 */
public class HouseBlend extends AbstractBeverage {
    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
