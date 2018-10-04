package com.zereao.memento.demo01;

/**
 * 《设计模式之禅》范例
 *
 * @author Zereao
 * @version 2018/10/04  21:09
 */
public class Boy {
    private String state = null;

    public void changeState() {
        this.state = "心情可能不好";
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    // 保留一个备份
    public Memento createMemento() {
        return new Memento(this.state);
    }

    // 恢复一个备份
    public void restoreMemento(Memento memento) {
        this.setState(memento.getState());
    }
}
