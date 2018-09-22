package com.zereao.singleton.demo02;

/**
 * @author Zereao
 * @version 2018/09/21  22:59
 */
public class Main {
    public static void main(String[] args) {
        int ministerNum = 5;
        for (int i = 0; i < ministerNum; i++) {
            Emperor emperor = Emperor.getInstance();
            System.out.println("第 " + (i + 1) + " 个大臣参拜的是：");
            Emperor.say();
        }
    }
}
