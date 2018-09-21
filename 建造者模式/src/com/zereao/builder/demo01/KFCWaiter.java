package com.zereao.builder.demo01;

/**
 * @author Zereao
 * @version 2018/09/20  19:46
 */
public class KFCWaiter {
    private AbstractMealBuilder mealBuilder;

    public void setMealBuilder(AbstractMealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public Meal construct() {
        mealBuilder.buildFood();
        mealBuilder.buildDrink();
        return mealBuilder.getMeal();
    }
}
