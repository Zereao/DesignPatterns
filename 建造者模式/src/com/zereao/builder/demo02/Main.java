package com.zereao.builder.demo02;

/**
 * @author Zereao
 * @version 2018/09/20  19:38
 */
public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        for (int i = 0; i < 10; i++) {
            director.getBenzModelA().run();
        }
    }
}
