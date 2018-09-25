package com.zereao.factory.extend.simplefactory.demo02;

import java.util.Scanner;

/**
 * 一道面试题：使用java实现一个计算机控制台程序，要求输入数的运算，得到结果。
 *
 * @author Zereao
 * @version 2018/07/18  15:36
 */
public class Computer {
    // 原始方法，并不是我们想要的结果
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        float firstNum = in.nextFloat();
        System.out.println("请输入第二个数字：");
        float secondNum = in.nextFloat();
        System.out.println("请输入运算符号：");
        String countQuato = in.next();
        if ("+".equals(countQuato)) {
            System.out.println("result : " + (firstNum + secondNum));
        } else if ("-".equals(countQuato)) {
            System.out.println("result : " + (firstNum - secondNum));
        } else if ("*".equals(countQuato)) {
            System.out.println("result : " + (firstNum * secondNum));
        } else if ("/".equals(countQuato)) {
            System.out.println("result : " + (firstNum / secondNum));
        }
    }
}
