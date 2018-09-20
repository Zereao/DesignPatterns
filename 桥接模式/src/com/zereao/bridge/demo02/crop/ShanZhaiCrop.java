package com.zereao.bridge.demo02.crop;

import com.zereao.bridge.demo02.AbstractCrop;
import com.zereao.bridge.demo02.AbstractProduct;

/**
 * @author Zereao
 * @version 2018/09/17  11:40
 */
public class ShanZhaiCrop extends AbstractCrop {
    public ShanZhaiCrop(AbstractProduct product) {
        super(product);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("我赚钱呀....");
    }
}
