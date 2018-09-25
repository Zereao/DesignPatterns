package com.zereao.factory.extend.simplefactory.demo03;

import com.zereao.factory.demo01.Human;

/**
 * 简单工厂模式中的工厂类
 *
 * @author Zereao
 * @version 2018/09/25  17:12
 */
public class HumanFactory {
    @SuppressWarnings("unchecked")
    public static <T extends Human> T createHuman(Class<T> clz) {
        T human = null;
        try {
            human = (T) Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return human;
    }
}
