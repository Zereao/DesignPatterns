package com.zereao.observer.demo01;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * 被观察者实现类
 *
 * @author Zereao
 * @version 2018/09/28  19:26
 */
public class HanFeiZi extends Observable implements IHanFeiZi {
    // 定义个变长数组，存放观察者
    private List<Observer> observerList = new ArrayList<>();

    @Override
    public void haveBreakfast() {
        String context = "韩非子开始吃饭了";
        System.out.println(context);
        // 通知所有观察者
        super.setChanged(); // 此方法非常重要
        super.notifyObservers("通知：" + context);
    }

    @Override
    public void haveFun() {
        String context = "韩非子开始娱乐了";
        System.out.println(context);
        // 通知所有观察者
        super.setChanged();
        this.notifyObservers("通知：" + context);
    }

//    @Override
//    public void addObserver(Observer observer) {
//        this.observerList.add(observer);
//    }
//
//    @Override
//    public void deleteObserver(Observer observer) {
//        this.observerList.remove(observer);
//    }
//
//    @Override
//    public void notifyObservers(String context) {
//        for (Observer observer : observerList) {
//            observer.update(context);
//        }
//    }
}
