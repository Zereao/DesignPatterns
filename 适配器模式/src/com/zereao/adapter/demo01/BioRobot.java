package com.zereao.adapter.demo01;

/**
 * @author Zereao
 * @version 2018/09/17  13:48
 */
public class BioRobot implements Robot {
    @Override
    public void cry() {
        System.out.println("仿生机器人叫.....");
    }

    @Override
    public void move() {
        System.out.println("仿生机器人慢慢移动....");
    }
}
