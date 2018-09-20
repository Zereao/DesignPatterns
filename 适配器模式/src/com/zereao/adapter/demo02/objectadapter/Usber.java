package com.zereao.adapter.demo02.objectadapter;

import com.zereao.adapter.demo02.Usb;

/**
 * @author Zereao
 * @version 2018/09/18  14:19
 */
public class Usber implements Usb {
    @Override
    public void isUsb() {
        System.out.println("USB口");
    }
}
