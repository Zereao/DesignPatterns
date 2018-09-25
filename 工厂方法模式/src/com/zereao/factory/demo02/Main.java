package com.zereao.factory.demo02;

import com.zereao.factory.demo01.Human;
import com.zereao.factory.demo02.factory.BlackHumanFactory;
import com.zereao.factory.demo02.factory.WhiteHumanFactory;

/**
 * @author Zereao
 * @version 2018/09/25  18:22
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("造出的第一批人是白色人种");
        AbstractHumanFactory humanFactory = new WhiteHumanFactory();
        Human whiteHuman = humanFactory.createHuman();
        whiteHuman.getColor();
        whiteHuman.talk();

        System.out.println("第二批是黑人");
        humanFactory = new BlackHumanFactory();
        Human blackHuman = humanFactory.createHuman();
        blackHuman.getColor();
        blackHuman.talk();
    }
}
