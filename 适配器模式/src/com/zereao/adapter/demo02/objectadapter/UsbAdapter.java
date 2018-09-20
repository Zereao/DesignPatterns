package com.zereao.adapter.demo02.objectadapter;

import com.zereao.adapter.demo02.Ps2;
import com.zereao.adapter.demo02.Usb;

public class UsbAdapter implements Ps2 {
    private Usb usb;

    public UsbAdapter(Usb usb) {
        this.usb = usb;
    }

    @Override
    public void isPs2() {
        usb.isUsb();
    }
}
