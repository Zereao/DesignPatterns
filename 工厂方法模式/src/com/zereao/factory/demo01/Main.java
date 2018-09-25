package com.zereao.factory.demo01;

import com.zereao.factory.demo01.entity.WhiteHuman;

/**
 * @author Zereao
 * @version 2018/09/25  16:23
 */
public class Main {
    public static void main(String[] args) {
        // 声明阴阳八卦炉
        AbstractHumanFactory yinyanglu = new HumanFactory();
        // 白人
        Human whiteHuman = yinyanglu.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
    }
}
