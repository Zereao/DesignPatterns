package com.zereao.factory.demo03.entity;


import com.zereao.factory.demo03.Pizza;

/**
 * @author Zereao
 * @version 2018/07/19  18:39
 */
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "芝加哥风味-厚奶酪披萨";
        dough = "厚皮面团";
        sause = "李子番茄酱";
        toppingList.add("芝士干酪丝");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the Pizza into square slices");
    }
}
