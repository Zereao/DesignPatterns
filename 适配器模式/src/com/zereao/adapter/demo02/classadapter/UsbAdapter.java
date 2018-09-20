package com.zereao.adapter.demo02.classadapter;

import com.zereao.adapter.demo02.Ps2;

/**
 * @author Zereao
 * @version 2018/09/17  14:19
 */
public class UsbAdapter extends Usber implements Ps2 {
    @Override
    public void isPs2() {
        isUsb();
    }
}
