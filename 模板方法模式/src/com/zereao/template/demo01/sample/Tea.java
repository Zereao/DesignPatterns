package com.zereao.template.demo01.sample;

/**
 * @author Zereao
 * @version 2018/09/20  21:03
 */
public class Tea {
    public void prepareRecipe() {
        this.boilWater();
        this.steepTeaBag();
        this.pourInCup();
        this.addLemon();
    }

    public void boilWater() {
        System.out.println("Boiling water...");
    }

    public void steepTeaBag() {
        System.out.println("Steeping the tea...");
    }

    public void pourInCup() {
        System.out.println("Pouring into Cup...");
    }

    public void addLemon() {
        System.out.println("Adding Lemon...");
    }
}
