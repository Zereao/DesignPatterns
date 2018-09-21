package com.zereao.builder.demo02;

/**
 * @author Zereao
 * @version 2018/09/20  20:22
 */
public class BenzModel extends AbstractCarModel {
    @Override
    protected void start() {
        System.out.println("奔驰开始了");
    }

    @Override
    protected void stop() {
        System.out.println("奔驰停下来");
    }

    @Override
    protected void alarm() {
        System.out.println("奔驰鸣笛");
    }

    @Override
    protected void engineBoom() {
        System.out.println("奔驰引擎声音");
    }
}
