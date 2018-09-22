package com.zereao.strategy.demo01;

/**
 * 策略、算法家族的封装，通常为接口，定义每个策略或者算法家族必须共有的方法和属性。
 *
 * @author Zereao
 * @version 2018/09/22  21:16
 */
public interface IStrategy {
    // 每条锦囊妙计都是一个可执行的算法
    void operate();
}
