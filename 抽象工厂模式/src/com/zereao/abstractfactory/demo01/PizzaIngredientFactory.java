package com.zereao.abstractfactory.demo01;


import com.zereao.abstractfactory.demo01.ingredient.abs.*;
import demo01.ingredient.abs.*;

/**
 * 抽象原料工厂，负责创建所有的原料。
 *
 * @author Zereao
 * @version 2018/07/23  17:12
 */
public interface PizzaIngredientFactory {
    /*
     * 在接口中，每个原料都有一个对应的方法创建该原料
     */
    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClams();
}
