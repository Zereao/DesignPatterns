package com.zereao.strategy.demo01.sample.demo3;

/**
 * @author Zereao
 * @version 2018/09/22  22:16
 */
public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        String addSymbol = "+";
        String subSymbol = "-";
        System.out.println("输入的参数为：a = " + a + "，b = " + b + "，运算符为：" + addSymbol);
        System.out.println(CalculatorEnum.ADD.exec(a, b));
        System.out.println("输入的参数为：a = " + a + "，b = " + b + "，运算符为：" + subSymbol);
        System.out.println(CalculatorEnum.SUB.exec(a, b));
    }
}
