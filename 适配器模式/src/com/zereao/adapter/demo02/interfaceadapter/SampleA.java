package com.zereao.adapter.demo02.interfaceadapter;

/**
 * @author Zereao
 * @version 2018/09/18  14:42
 */
public class SampleA extends AbstractAdapter {
    @Override
    public void a() {
        System.out.println("实现A方法被调用");
    }

    @Override
    public void d() {
        System.out.println("实现d方法被调用");
    }
}
