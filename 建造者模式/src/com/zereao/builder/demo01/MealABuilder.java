package com.zereao.builder.demo01;

/**
 * @author Zereao
 * @version 2018/09/20  19:44
 */
public class MealABuilder extends AbstractMealBuilder {
    @Override
    public void buildFood() {
        meal.setFood("三个鸡翅");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("一杯柠檬汁");
    }
}
