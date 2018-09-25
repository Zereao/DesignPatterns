package com.zereao.factory.demo03.entity;

import com.zereao.factory.demo03.Pizza;

/**
 * @author Zereao
 * @version 2018/07/18  18:01
 */
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "纽约风味-酱汁奶酪披萨！";
        dough = "薄皮面团";
        sause = "番茄酱";
        toppingList.add("里奇诺奶酪");
    }
}
