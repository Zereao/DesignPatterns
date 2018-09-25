package com.zereao.factory.demo03;


import com.zereao.factory.demo03.entity.ChicagoStyleCheesePizza;
import com.zereao.factory.demo03.entity.ChicagoStyleClamPizza;
import com.zereao.factory.demo03.entity.ChicagoStylePepperoniPizza;
import com.zereao.factory.demo03.entity.ChicagoStyleVeggiePizza;

/**
 * @author Zereao
 * @version 2018/07/20  11:28
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            pizza = new ChicagoStyleCheesePizza();
        } else if ("clam".equals(type)) {
            pizza = new ChicagoStyleClamPizza();
        } else if ("pepperoni".equals(type)) {
            pizza = new ChicagoStylePepperoniPizza();
        } else if ("veggie".equals(type)) {
            pizza = new ChicagoStyleVeggiePizza();
        }
        return pizza;
    }
}
