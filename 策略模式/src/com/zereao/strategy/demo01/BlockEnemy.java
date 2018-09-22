package com.zereao.strategy.demo01;

/**
 * @author Zereao
 * @version 2018/09/22  21:18
 */
public class BlockEnemy implements IStrategy {
    @Override
    public void operate() {
        System.out.println("孙夫人断后，挡住追兵");
    }
}
