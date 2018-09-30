package com.zereao.observer.demo01;

/**
 * 被观察者
 *
 * @author Zereao
 * @version 2018/09/28  19:22
 */
public interface Observable {
    // 增加一个观察者
    void addObserver(Observer observer);

    // 删除一个观察者
    void deleteObserver(Observer observer);

    // 通知观察者
    void notifyObservers(String context);
}
