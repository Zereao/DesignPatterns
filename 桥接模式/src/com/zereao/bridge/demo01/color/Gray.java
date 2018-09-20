package com.zereao.bridge.demo01.color;

import com.zereao.bridge.demo01.AbstractColor;

/**
 * @author Zereao
 * @version 2018/09/17  11:18
 */
public class Gray implements AbstractColor {
    @Override
    public void bepaint(String shape) {
        System.out.println("灰色的" + shape);
    }
}
