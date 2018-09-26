package com.zereao.abstractfactory.demo02.human;

/**
 * @author Zereao
 * @version 2018/07/25  10:32
 */
public class MaleYellowHuman extends AbstractYellowHuman {

    @Override
    public void getSex() {
        System.out.println("黄种人男性");
    }
}
