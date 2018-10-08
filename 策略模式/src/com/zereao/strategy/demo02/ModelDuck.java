package com.zereao.strategy.demo02;

/**
 * @author Zereao
 * @version 2018/10/08  22:05
 */
public class ModelDuck extends AbstractDuck {
    public ModelDuck() {
        super.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Quack();
//        super.quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck!");
    }
}
