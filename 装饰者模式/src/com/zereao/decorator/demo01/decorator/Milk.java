package com.zereao.decorator.demo01.decorator;

import com.zereao.decorator.demo01.AbstractBeverage;
import com.zereao.decorator.demo01.AbstractCondimentDecorator;

/**
 * @author 何雨伦
 * @version 2018/09/13  17:10
 */
public class Milk extends AbstractCondimentDecorator {
    private AbstractBeverage beverage;

    public Milk(AbstractBeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " , Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.3;
    }
}
