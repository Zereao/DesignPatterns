package com.zereao.strategy.demo02;

/**
 * @author Zereao
 * @version 2018/10/08  22:08
 */
public class MallardDuck extends AbstractDuck {
    public MallardDuck() {
        this.quackBehavior = new Quack();
        this.flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Mallard Duck!");
    }
}
