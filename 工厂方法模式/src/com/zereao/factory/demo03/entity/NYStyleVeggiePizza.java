package com.zereao.factory.demo03.entity;

import com.zereao.factory.demo03.Pizza;

/**
 * @author Zereao
 * @version 2018/07/19  18:57
 */
public class NYStyleVeggiePizza extends Pizza {
    public NYStyleVeggiePizza() {
        name = "纽约风味-VeggiePizza！";
        dough = "薄皮面团";
        sause = "番茄酱";
        toppingList.add("里奇诺奶酪");
    }
}
