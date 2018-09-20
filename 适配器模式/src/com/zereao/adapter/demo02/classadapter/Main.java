package com.zereao.adapter.demo02.classadapter;

import com.zereao.adapter.demo02.Ps2;

/**
 * 类适配器模式
 * https://www.cnblogs.com/V1haoge/p/6479118.html
 *
 * @author Zereao
 * @version 2018/09/17  14:16
 */
public class Main {
    public static void main(String[] args) {
        Ps2 ps2 = new UsbAdapter();
        ps2.isPs2();
    }
}
