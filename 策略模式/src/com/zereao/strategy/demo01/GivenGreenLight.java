package com.zereao.strategy.demo01;

/**
 * @author Zereao
 * @version 2018/09/22  21:17
 */
public class GivenGreenLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("求吴国太给自己开绿灯，放行");
    }
}
