package com.zereao.template.demo01;

/**
 * @author Zereao
 * @version 2018/09/21  15:42
 */
public abstract class AbstractBeverage {
    /**
     * 模板方法，用来控制泡茶与冲咖啡的流程
     * 申明为final，不希望子类覆盖这个方法，防止更改流程的执行顺序
     */
    public final void prepareRecipe() {
        this.boilWater();
        this.brew();
        this.pourInCup();
        this.addCondiments();
    }

    /**
     * 将brew()、addCondiment()声明为抽象类，具体操作由子类实现
     */
    public abstract void brew();

    public abstract void addCondiments();

    public void boilWater() {
        System.out.println("Boiling water...");
    }

    public void pourInCup() {
        System.out.println("Pouring into Cup...");
    }
}
