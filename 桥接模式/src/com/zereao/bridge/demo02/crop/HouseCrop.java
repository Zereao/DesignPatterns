package com.zereao.bridge.demo02.crop;

import com.zereao.bridge.demo02.AbstractCrop;
import com.zereao.bridge.demo02.AbstractProduct;

/**
 * @author Zereao
 * @version 2018/09/17  11:39
 */
public class HouseCrop extends AbstractCrop {
    public HouseCrop(AbstractProduct product) {
        super(product);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("房地产公司赚大钱了....");
    }
}
