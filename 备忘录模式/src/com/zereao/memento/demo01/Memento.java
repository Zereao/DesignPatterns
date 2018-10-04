package com.zereao.memento.demo01;

/**
 * 备忘录类
 *
 * @author Zereao
 * @version 2018/10/04  21:11
 */
public class Memento {
    private String state = null;

    // 通过构造函数传递状态信息
    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
