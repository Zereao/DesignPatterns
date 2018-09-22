package com.zereao.strategy.demo01.sample.demo1;

/**
 * 《设计模式之禅》中扩展题目
 * 输入三个参数，两个int类型数字，一个String类型的 + 或者 - 符号，求运算结果
 *
 * @author Zereao
 * @version 2018/09/22  21:53
 */
public class Main {

    private static final String ADD_SYMBOL = "+";
    private static final String SUB_SYMBOL = "-";

    // 加法运算
    public int add(int a, int b) {
        return a + b;
    }

    // 减法运算
    public int sub(int a, int b) {
        return a - b;
    }

    public int exec(int a, int b, String symbol) {
        int result = 0;
        if (symbol.endsWith(ADD_SYMBOL)) {
            result = this.add(a, b);
        } else if (symbol.equals(SUB_SYMBOL)) {
            result = a - b;
        }
        return result;
    }

    public int exec_2(int a, int b, String symbol) {
        return symbol.equals(ADD_SYMBOL) ? a + b : a - b;
    }

    public static void main(String[] args) {
        Main main = new Main();
        int a = 5;
        int b = 3;
        String addSymbol = "+";
        String subSymbol = "-";
        System.out.println("输入的参数为：a = " + a + "，b = " + b + "，运算符为：" + addSymbol);
        System.out.println(main.exec(a, b, addSymbol));
        System.out.println("输入的参数为：a = " + a + "，b = " + b + "，运算符为：" + subSymbol);
        System.out.println(main.exec(a, b, subSymbol));
    }

}
