package com.zereao.observer.demo01;

import java.util.Observable;
import java.util.Observer;

/**
 * 具体的观察者
 *
 * @author Zereao
 * @version 2018/09/28  19:32
 */
public class LiSi implements Observer {
    // 汇报给秦始皇
    private void reportToEmpireQin(String context) {
        System.out.println("李斯：报告秦老板，韩非子有活动了:" + context);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("李斯:观察到韩非子" + o + "活动，他就知道要向老板汇报。");
        this.reportToEmpireQin(arg.toString());
        System.out.println("李斯：汇报完毕");
    }
}
