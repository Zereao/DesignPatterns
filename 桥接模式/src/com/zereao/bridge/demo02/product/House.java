package com.zereao.bridge.demo02.product;

import com.zereao.bridge.demo02.AbstractProduct;

/**
 * @author Zereao
 * @version 2018/09/17  11:35
 */
public class House extends AbstractProduct {

    @Override
    public void beProducted() {
        System.out.println("生产出的房子是这样的。。。");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出的房子被卖出去了....");
    }
}
