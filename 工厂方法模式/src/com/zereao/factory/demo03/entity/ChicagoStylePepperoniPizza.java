package com.zereao.factory.demo03.entity;


import com.zereao.factory.demo03.Pizza;

/**
 * @author Zereao
 * @version 2018/07/20  11:30
 */
public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza() {
        name = "芝加哥风味-ChicagoStylePepperoniPizza";
        dough = "厚皮面团";
        sause = "李子番茄酱";
        toppingList.add("芝士干酪丝");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the Pizza into square slices");
    }
}
