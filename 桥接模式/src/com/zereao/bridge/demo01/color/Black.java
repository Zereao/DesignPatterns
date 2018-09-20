package com.zereao.bridge.demo01.color;

import com.zereao.bridge.demo01.AbstractColor;

/**
 * @author Zereao
 * @version 2018/09/17  11:19
 */
public class Black implements AbstractColor {
    @Override
    public void bepaint(String shape) {
        System.out.println("黑色的" + shape);
    }
}
