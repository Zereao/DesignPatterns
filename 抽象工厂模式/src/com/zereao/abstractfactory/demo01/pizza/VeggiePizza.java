package com.zereao.abstractfactory.demo01.pizza;


import com.zereao.abstractfactory.demo01.PizzaIngredientFactory;

/**
 * @author Zereao
 * @version 2018/07/23  17:35
 */
public class VeggiePizza extends AbstractPizza {

    private PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Prepare " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clams = ingredientFactory.createClams();
    }
}
