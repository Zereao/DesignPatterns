package com.zereao.memento.demo01;

/**
 * 备忘录管理者
 *
 * @author Zereao
 * @version 2018/10/04  21:18
 */
public class Caretaker {
    // 备忘录对象
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
