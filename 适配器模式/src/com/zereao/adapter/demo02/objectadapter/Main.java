package com.zereao.adapter.demo02.objectadapter;

import com.zereao.adapter.demo02.Ps2;

/**
 * @author Zereao
 * @version 2018/09/18  14:16
 */
public class Main {
    public static void main(String[] args) {
        Ps2 p = new UsbAdapter(new Usber());
        p.isPs2();
    }
}
