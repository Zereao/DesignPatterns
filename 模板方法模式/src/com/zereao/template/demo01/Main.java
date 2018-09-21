package com.zereao.template.demo01;

import com.zereao.template.demo01.hook.AbstractBeverageWithHook;
import com.zereao.template.demo01.hook.CoffeeWithHook;

/**
 * @author Zereao
 * @version 2018/09/20  20:53
 */
public class Main {
    public static void main(String[] args) {
        AbstractBeverage tea = new Tea();
        tea.prepareRecipe();
        testWithHook();
    }

    private static void testWithHook() {
        AbstractBeverageWithHook beverageWithHook = new CoffeeWithHook();
        beverageWithHook.prepareRecipe();
    }
}
