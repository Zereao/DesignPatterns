package com.zereao.builder.demo01;

/**
 * @author Zereao
 * @version 2018/09/20  19:44
 */
public class MealBBuilder extends AbstractMealBuilder {
    @Override
    public void buildFood() {
        meal.setFood("一盒薯条");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("一杯可乐");
    }
}
