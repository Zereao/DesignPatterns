package com.zereao.strategy.demo01.sample.demo2;

/**
 * 题目同demo1,这里引入策略模式
 *
 * @author Zereao
 * @version 2018/09/22  22:02
 */
public class Main {
    private static final String ADD_SYMBOL = "+";
    private static final String SUB_SYMBOL = "-";

    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        String addSymbol = "+";
        String subSymbol = "-";
        System.out.println("输入的参数为：a = " + a + "，b = " + b + "，运算符为：" + addSymbol);
        Context context = null;
        context = new Context(new Add());
        System.out.println(context.exec(a, b));
        System.out.println("输入的参数为：a = " + a + "，b = " + b + "，运算符为：" + subSymbol);
        context = new Context(new Sub());
        System.out.println(context.exec(a, b));
    }
}
