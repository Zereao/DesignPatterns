package com.zereao.bridge.demo01.shape;

import com.zereao.bridge.demo01.AbstractShape;

/**
 * @author Zereao
 * @version 2018/09/17  11:15
 */
public class Square extends AbstractShape {
    @Override
    public void draw() {
        color.bepaint("正方形");
    }
}
