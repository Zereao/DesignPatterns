package com.zereao.template.demo01.hook;

/**
 * @author Zereao
 * @version 2018/09/21  15:58
 */
public abstract class AbstractBeverageWithHook {
    public void prepareRecipe() {
        this.boilWater();
        this.brew();
        this.pourInCup();
        if (customerWantsCondiments()) {    //如果顾客需要添加调料，我们才会调用addCondiments()方法
            this.addCondiments();
        }
        System.out.println(this.getClass().getSimpleName());
    }

    public abstract void brew();

    public abstract void addCondiments();

    public void boilWater() {
        System.out.println("Boiling water...");
    }

    public void pourInCup() {
        System.out.println("Pouring into Cup...");
    }

    public boolean customerWantsCondiments() {
        return true;
    }
}
