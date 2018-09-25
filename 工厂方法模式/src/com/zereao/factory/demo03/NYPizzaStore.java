package com.zereao.factory.demo03;


import com.zereao.factory.demo03.entity.NYStyleCheesePizza;
import com.zereao.factory.demo03.entity.NYStyleClamPizza;
import com.zereao.factory.demo03.entity.NYStylePepperoniPizza;
import com.zereao.factory.demo03.entity.NYStyleVeggiePizza;

/**
 * 具体工厂 - 纽约披萨分店
 *
 * @author Zereao
 * @version 2018/07/19  18:53
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String item) {
        Pizza pizza = null;
        if ("cheese".equals(item)) {
            pizza = new NYStyleCheesePizza();
        } else if ("veggie".equals(item)) {
            pizza = new NYStyleVeggiePizza();
        } else if ("clam".equals(item)) {
            pizza = new NYStyleClamPizza();
        } else if ("pepperoni".equals(item)) {
            pizza = new NYStylePepperoniPizza();
        }
        return pizza;
    }
}
