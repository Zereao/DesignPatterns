package com.zereao.adapter.demo02.classadapter;

import com.zereao.adapter.demo02.Usb;

/**
 * @author Zereao
 * @version 2018/09/17  14:17
 */
public class Usber implements Usb {
    @Override
    public void isUsb() {
        System.out.println("USB接口");
    }
}
