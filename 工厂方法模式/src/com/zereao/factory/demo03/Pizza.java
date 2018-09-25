package com.zereao.factory.demo03;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象产品类
 *
 * @author Zereao
 * @version 2018/07/18  17:46
 */
public abstract class Pizza {
    //名称
    protected String name;
    //面团
    protected String dough;
    //酱料
    protected String sause;
    //佐料
    protected List<String> toppingList = new ArrayList<>();

    public void prepare() {
        System.out.println("开始准备 - " + name);
        System.out.println("揉面团中...");
        System.out.println("加入酱汁...");
        System.out.println("加入佐料...");
        for (String topping : toppingList) {
            System.out.println(" " + topping);
        }
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
