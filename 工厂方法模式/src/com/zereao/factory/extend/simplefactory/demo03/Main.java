package com.zereao.factory.extend.simplefactory.demo03;

import com.zereao.factory.demo01.Human;
import com.zereao.factory.demo01.entity.BlackHuman;
import com.zereao.factory.demo01.entity.WhiteHuman;

/**
 * @author Zereao
 * @version 2018/09/25  17:12
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("造出的第一批人是白色人种");
        Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();

        System.out.println("第二批是黑人");
        Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
    }
}
