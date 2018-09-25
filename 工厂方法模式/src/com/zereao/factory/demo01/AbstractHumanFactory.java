package com.zereao.factory.demo01;

/**
 * 抽象人类创建工厂
 *
 * @author Zereao
 * @version 2018/07/24  10:13
 */
public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> c);
}
