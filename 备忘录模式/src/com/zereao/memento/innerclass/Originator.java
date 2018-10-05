package com.zereao.memento.innerclass;

/**
 * 使用内部类的发起人角色
 *
 * @author Zereao
 * @version 2018/10/05  23:50
 */
public class Originator {
    // 内部状态
    private String state = null;


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    // 创建一个备忘录
    public IMemento createMemento() {
        return new Memento(this.state);
    }

    // 恢复一个备忘录
    public void restoreMemento(IMemento memento) {
        this.setState(((Memento) memento).getState());
    }

    // 内置类
    private class Memento implements IMemento {
        // 发起人的内部状态
        private String state = null;
        // 构造函数传递参数

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
}
