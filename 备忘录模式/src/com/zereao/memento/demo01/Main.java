package com.zereao.memento.demo01;

/**
 * @author Zereao
 * @version 2018/10/04  21:07
 */
public class Main {
    public static void main(String[] args) {
        Boy boy = new Boy();
        // 声明出备忘录的管理者
        Caretaker caretaker = new Caretaker();
        boy.setState("心情很棒！");
        System.out.println("男孩现在的状态:" + boy.getState());
        // 需要记录现在的状态
        Memento memento = boy.createMemento();
        caretaker.setMemento(memento);
        // 状态改变了
        boy.changeState();
        System.out.println("男孩现在的状态：" + boy.getState());
        // 失败，返回原样
        boy.restoreMemento(caretaker.getMemento());
        System.out.println("男孩现在的状态：" + boy.getState());
    }
}
