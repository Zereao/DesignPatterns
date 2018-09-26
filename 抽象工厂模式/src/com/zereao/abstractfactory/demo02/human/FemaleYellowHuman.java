package com.zereao.abstractfactory.demo02.human;

/**
 * @author Zereao
 * @version 2018/07/25  10:31
 */
public class FemaleYellowHuman extends AbstractYellowHuman {

    @Override
    public void getSex() {
        System.out.println("黄种人女性");
    }

}
