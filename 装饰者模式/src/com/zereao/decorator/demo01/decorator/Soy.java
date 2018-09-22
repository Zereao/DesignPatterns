package com.zereao.decorator.demo01.decorator;

import com.zereao.decorator.demo01.AbstractBeverage;
import com.zereao.decorator.demo01.AbstractCondimentDecorator;

/**
 * @author Zereao
 * @version 2018/09/13  17:12
 */
public class Soy extends AbstractCondimentDecorator {
    private AbstractBeverage beverage;

    public Soy(AbstractBeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }
}
