package com.zereao.factory.demo03;

/**
 * 抽象工厂-披萨总店
 *
 * @author Zereao
 * @version 2018/07/19  18:43
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    /*
     * 创建pizza的方法交给子类去实现
     */
    abstract Pizza createPizza(String type);
}
