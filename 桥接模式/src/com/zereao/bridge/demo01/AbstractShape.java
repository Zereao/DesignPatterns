package com.zereao.bridge.demo01;

/**
 * @author Zereao
 * @version 2018/09/17  11:04
 */
public abstract class AbstractShape {
    protected AbstractColor color;

    public void setColor(AbstractColor color) {
        this.color = color;
    }

    public abstract void draw();
}
