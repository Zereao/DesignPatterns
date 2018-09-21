package com.zereao.template.demo01.sample;

/**
 * @author Zereao
 * @version 2018/09/20  20:54
 */
public class Coffee {
    public void prepareRecipe() {
        this.boilWater();
        this.brewCoffeeGrinds();
        this.pourInCup();
        this.addSugarAndMilk();
    }

    public void boilWater() {
        System.out.println("Boiling water...");
    }

    public void brewCoffeeGrinds() {
        System.out.println("Dripping Beverage through filter...");
    }


    public void pourInCup() {
        System.out.println("Pouring into Cup...");
    }

    public void addSugarAndMilk() {
        System.out.println("Adding Sugar and Milk...");
    }
}
