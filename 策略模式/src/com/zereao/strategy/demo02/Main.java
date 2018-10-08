package com.zereao.strategy.demo02;

/**
 * 《Head First 设计模式》中的范例
 *
 * @author Zereao
 * @version 2018/10/08  21:49
 */
public class Main {
    public static void main(String[] args) {
        AbstractDuck mallard = new MallardDuck();
        mallard.performQuake();
        mallard.performFly();

        AbstractDuck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRockedPowered());
        model.performFly();
    }
}
