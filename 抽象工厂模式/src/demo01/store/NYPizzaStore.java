package demo01.store;

import demo01.NYPizzaIngredientFactory;
import demo01.PizzaIngredientFactory;
import demo01.pizza.*;

/**
 * @author Zereao
 * @version 2018/07/23  17:29
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    AbstractPizza createPizza(String type) {
        AbstractPizza pizza = null;
        //使用纽约的原料工厂
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if ("cheese".equals(type)) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese AbstractPizza");
        } else if ("veggie".equals(type)) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie AbstractPizza");
        } else if ("clam".equals(type)) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam AbstractPizza");
        } else if ("pepperoni".equals(type)) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni AbstractPizza");
        }
        return pizza;
    }
}
