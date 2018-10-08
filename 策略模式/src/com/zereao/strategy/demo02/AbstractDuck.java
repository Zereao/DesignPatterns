package com.zereao.strategy.demo02;

/**
 * @author Zereao
 * @version 2018/10/08  22:02
 */
public abstract class AbstractDuck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public void performFly() {
        this.flyBehavior.fly();
    }

    public void performQuake() {
        this.quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
