package com.zereao.builder.demo01;

/**
 * @author Zereao
 * @version 2018/09/20  19:42
 */
public abstract class AbstractMealBuilder {
    protected Meal meal = new Meal();

    public abstract void buildFood();

    public abstract void buildDrink();

    public Meal getMeal() {
        return this.meal;
    }
}
