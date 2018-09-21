package com.zereao.builder.demo01;

/**
 * @author Zereao
 * @version 2018/09/20  19:38
 */
public class Main {
    public static void main(String[] args) {
        // 声明一个服务员
        KFCWaiter waiter = new KFCWaiter();
        // 套餐A
        MealABuilder a = new MealABuilder();
        // 服务员准备套餐A
        waiter.setMealBuilder(a);
        // 获得套餐
        Meal mealA = waiter.construct();
        System.out.print("套餐A的组成部分：");
        System.out.println(mealA.getFood() + "-----" + mealA.getDrink());
    }
}
