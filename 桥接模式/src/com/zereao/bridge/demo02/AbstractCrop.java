package com.zereao.bridge.demo02;

/**
 * @author Zereao
 * @version 2018/09/17  11:37
 */
public class AbstractCrop {
    private AbstractProduct product;

    public AbstractCrop(AbstractProduct product) {
        this.product = product;
    }

    public void makeMoney() {
        this.product.beProducted();
        this.product.beSelled();
    }
}
