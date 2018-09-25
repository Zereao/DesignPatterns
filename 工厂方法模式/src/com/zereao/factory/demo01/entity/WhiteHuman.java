package com.zereao.factory.demo01.entity;


import com.zereao.factory.demo01.Human;

/**
 * 具体人类-白人
 *
 * @author Zereao
 * @version 2018/07/24  10:08
 */
public class WhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("白人的皮肤是白色的。");
    }

    @Override
    public void talk() {
        System.out.println("白人一般说英语");
    }
}
