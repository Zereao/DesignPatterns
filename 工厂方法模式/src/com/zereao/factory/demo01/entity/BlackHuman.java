package com.zereao.factory.demo01.entity;


import com.zereao.factory.demo01.Human;

/**
 * 具体人类-黑人
 *
 * @author Zereao
 * @version 2018/07/24  10:06
 */
public class BlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黑人皮肤是黑色的！");
    }

    @Override
    public void talk() {
        System.out.println("黑人一般说英语。");
    }
}
