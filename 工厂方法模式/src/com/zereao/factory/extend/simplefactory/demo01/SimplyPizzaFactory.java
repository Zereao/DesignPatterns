package com.zereao.factory.extend.simplefactory.demo01;

import com.zereao.factory.extend.simplefactory.demo01.entity.CheesePizza;
import com.zereao.factory.extend.simplefactory.demo01.entity.ClamPizza;
import com.zereao.factory.extend.simplefactory.demo01.entity.PepperoniPizza;
import com.zereao.factory.extend.simplefactory.demo01.entity.VeggiePizze;

/**
 * 一个专门用于创建Pizza的工厂类
 *
 * @author Zereao
 * @version 2018/07/10/  15:19
 */
public class SimplyPizzaFactory {
    public static Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            pizza = new CheesePizza();
        } else if ("calm".equals(type)) {
            pizza = new ClamPizza();
        } else if ("pepperoni".equals(type)) {
            pizza = new PepperoniPizza();
        } else if ("veggie".equals(type)) {
            pizza = new VeggiePizze();
        }
        return pizza;
    }
}
