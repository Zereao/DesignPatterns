package com.zereao.factory.demo02.factory;

import com.zereao.factory.demo01.Human;
import com.zereao.factory.demo01.entity.BlackHuman;
import com.zereao.factory.demo02.AbstractHumanFactory;

/**
 * @author Zereao
 * @version 2018/09/25  18:20
 */
public class BlackHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new BlackHuman();
    }
}
