package com.zereao.bridge.demo01;

import com.zereao.bridge.demo01.color.White;
import com.zereao.bridge.demo01.shape.Rectangle;
import com.zereao.bridge.demo01.shape.Square;

/**
 * http://www.iocoder.cn/DesignPattern/xiaomingge/Bridge-Pattern/
 *
 * @author Zereao
 * @version 2018/09/17  11:20
 */
public class Main {
    public static void main(String[] args) {
        //白色
        AbstractColor white = new White();
        //正方形
        AbstractShape square = new Square();
        //白色的正方形
        square.setColor(white);
        square.draw();

        //长方形
        AbstractShape rectange = new Rectangle();
        rectange.setColor(white);
        rectange.draw();
    }
}
