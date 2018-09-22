package com.zereao.decorator.demo01.decorator;

import com.zereao.decorator.demo01.AbstractBeverage;
import com.zereao.decorator.demo01.AbstractCondimentDecorator;

/**
 * @author Zereai
 * @version 2018/09/13  17:11
 */
public class MoCha extends AbstractCondimentDecorator {
    private AbstractBeverage beverage;

    public MoCha(AbstractBeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " , Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }

}
