package com.zereao.abstractfactory.demo01;

import com.zereao.abstractfactory.demo01.ingredient.*;
import com.zereao.abstractfactory.demo01.ingredient.abs.*;
import demo01.ingredient.*;
import demo01.ingredient.abs.*;

/**
 * 具体工厂——纽约原料工厂
 *
 * @author Zereao
 * @version 2018/07/23  17:30
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Garlic(), new Onion(), new Mushroom(), new RefPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
