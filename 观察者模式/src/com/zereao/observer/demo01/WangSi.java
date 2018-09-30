package com.zereao.observer.demo01;

/**
 * 杜撰的观察者
 *
 * @author Zereao
 * @version 2018/09/28  19:32
 */
public class WangSi implements Observer {

    @Override
    public void update(String context) {
        System.out.println("王斯:观察到韩非子活动，自己也开始活动");
        this.cry(context);
        System.out.println("李斯：哭死了");
    }

    // 一看到韩非子有活动，王斯就痛哭
    private void cry(String context) {
        System.out.println("王斯：因为以下原因他很难过:" + context);
    }
}
