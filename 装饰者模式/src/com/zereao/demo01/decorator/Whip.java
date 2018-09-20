package com.zereao.demo01.decorator;

import com.zereao.demo01.AbstractBeverage;
import com.zereao.demo01.AbstractCondimentDecorator;

/**
 * @author Zereao
 * @version 2018/09/13  17:14
 */
public class Whip extends AbstractCondimentDecorator {
    private AbstractBeverage beverage;

    public Whip(AbstractBeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " , Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }
}
