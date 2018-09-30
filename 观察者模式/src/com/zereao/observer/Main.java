package com.zereao.observer;

import com.zereao.observer.demo01.HanFeiZi;
import com.zereao.observer.demo01.LiSi;

import java.util.Observer;

/**
 * @author Zereao
 * @version 2018/09/28  19:15
 */
public class Main {
    public static void main(String[] args) {
        Observer lisi = new LiSi();
//        Observer wangsi = new WangSi();
        // 韩非子
        HanFeiZi hanFeiZi = new HanFeiZi();
        hanFeiZi.addObserver(lisi);
//        hanFeiZi.addObserver(wangsi);
        hanFeiZi.haveBreakfast();
    }
}
