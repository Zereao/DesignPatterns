package com.zereao.memento.multiableDemo;


/**
 * 发起人角色
 *
 * @author Zereao
 * @version 2018/10/05  22:29
 */
public class Originator {
    // 内部状态
    private String state1 = null;
    private String state2 = null;
    private String state3 = null;

    // 创建一个备忘录
    public Memento createMemento() {
        return new Memento(BeanUtils.backupProp(this));
    }

    // 恢复一个备忘录
    public void restoreMemento(Memento memento) {
        BeanUtils.restoreProp(this, memento.getStateMap());
    }

    @Override
    public String toString() {
        return "Originator{" +
                "state1='" + state1 + '\'' +
                ", state2='" + state2 + '\'' +
                ", state3='" + state3 + '\'' +
                '}';
    }

    public String getState1() {
        return state1;
    }

    public void setState1(String state1) {
        this.state1 = state1;
    }

    public String getState2() {
        return state2;
    }

    public void setState2(String state2) {
        this.state2 = state2;
    }

    public String getState3() {
        return state3;
    }

    public void setState3(String state3) {
        this.state3 = state3;
    }
}
