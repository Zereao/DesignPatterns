package com.zereao.memento.innerclass;

/**
 * @author Zereao
 * @version 2018/10/05  23:56
 */
public class Caretaker {
    private IMemento memento;

    public IMemento getMemento() {
        return memento;
    }

    public void setMemento(IMemento memento) {
        this.memento = memento;
    }
}
