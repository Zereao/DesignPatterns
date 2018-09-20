package com.zereao.demo01;

/**
 * @author Zereao
 * @version 2018/09/13  16:58
 */
public abstract class AbstractBeverage {
    public String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
