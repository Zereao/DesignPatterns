package com.zereao.strategy.demo01;

/**
 * @author Zereao
 * @version 2018/09/22  21:16
 */
public class BackDoor implements IStrategy {
    @Override
    public void operate() {
        System.out.println("找乔国老帮忙，让吴国太给孙权施加压力");
    }
}
