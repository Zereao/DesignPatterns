package com.zereao.builder.demo02;

/**
 * @author Zereao
 * @version 2018/09/20  20:22
 */
public class BmwModel extends AbstractCarModel {
    @Override
    protected void start() {
        System.out.println("宝马开始了");
    }

    @Override
    protected void stop() {
        System.out.println("宝马停下来");
    }

    @Override
    protected void alarm() {
        System.out.println("宝马鸣笛");
    }

    @Override
    protected void engineBoom() {
        System.out.println("宝马引擎声音");
    }
}
