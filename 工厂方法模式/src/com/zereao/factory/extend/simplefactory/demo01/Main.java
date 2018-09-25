package com.zereao.factory.extend.simplefactory.demo01;

/**
 * @author Zereao
 * @version 2018/07/11  10:23
 */
public class Main {
    public static void main(String[] args) {
        new Main().orderPizza("cheese");
    }

    public Pizza orderPizza(String type) {
        // 使用工厂对象的创建方法，而不是直接new。这里不再使用具体实例化
        Pizza pizza = SimplyPizzaFactory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}
