package com.zereao.factory.demo01.entity;


import com.zereao.factory.demo01.Human;

/**
 * 具体人类-黄种人
 *
 * @author Zereao
 * @version 2018/07/24  10:09
 */
public class YellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄种人皮肤是黄色的。");
    }

    @Override
    public void talk() {
        System.out.println("黄种人说中文。");
    }
}
