package com.zereao.abstractfactory.demo01.store;


import com.zereao.abstractfactory.demo01.pizza.AbstractPizza;

/**
 * @author Zereao
 * @version 2018/07/23  17:23
 */
public abstract class PizzaStore {
    public AbstractPizza orderPizza(String type) {
        AbstractPizza pizza;
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
    abstract AbstractPizza createPizza(String type);
}
