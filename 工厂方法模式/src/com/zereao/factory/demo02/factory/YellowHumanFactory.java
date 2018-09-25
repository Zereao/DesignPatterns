package com.zereao.factory.demo02.factory;

import com.zereao.factory.demo01.Human;
import com.zereao.factory.demo01.entity.YellowHuman;
import com.zereao.factory.demo02.AbstractHumanFactory;

/**
 * @author Zereao
 * @version 2018/09/25  18:21
 */
public class YellowHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new YellowHuman();
    }
}
