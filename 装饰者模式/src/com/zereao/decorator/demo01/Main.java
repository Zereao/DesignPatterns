package com.zereao.decorator.demo01;

import com.zereao.decorator.demo01.beverage.DarkRoast;
import com.zereao.decorator.demo01.beverage.Espresso;
import com.zereao.decorator.demo01.decorator.Milk;
import com.zereao.decorator.demo01.decorator.MoCha;
import com.zereao.decorator.demo01.decorator.Whip;

/**
 * 《Head First 设计模式》中的范例
 *
 * @author Zereao
 * @version 2018/09/13  16:56
 */
public class Main {
    public static void main(String[] args) {
        AbstractBeverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        AbstractBeverage beverage2 = new DarkRoast();
        beverage2 = new Milk(beverage2);
        beverage2 = new MoCha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
