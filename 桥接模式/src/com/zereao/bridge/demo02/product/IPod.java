package com.zereao.bridge.demo02.product;

import com.zereao.bridge.demo02.AbstractProduct;

/**
 * @author Zereao
 * @version 2018/09/17  11:36
 */
public class IPod extends AbstractProduct {
    @Override
    public void beProducted() {
        System.out.println("生产出的iPod是这样的。。。");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出的iPod被卖出去了....");
    }
}
