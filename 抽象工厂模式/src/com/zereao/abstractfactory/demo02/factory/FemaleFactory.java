package com.zereao.abstractfactory.demo02.factory;

import com.zereao.abstractfactory.demo02.human.FemaleYellowHuman;
import com.zereao.abstractfactory.demo02.human.Human;

/**
 * 女性工厂
 *
 * @author Zereao
 * @version 2018/07/25  10:34
 */
public class FemaleFactory implements HumanFactory {

    @Override
    public Human getYellowHuman() {
        return new FemaleYellowHuman();
    }

    @Override
    public Human getWhiteHuman() {
        return null;
    }

    @Override
    public Human getBlackHuman() {
        return null;
    }
}
