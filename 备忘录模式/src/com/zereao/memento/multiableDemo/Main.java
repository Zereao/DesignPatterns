package com.zereao.memento.multiableDemo;


/**
 * @author Zereao
 * @version 2018/10/04  21:07
 */
public class Main {
    public static void main(String[] args) {
        // 定义出发起人
        Originator ori = new Originator();
        // 定义出备忘录管理员
        Caretaker caretaker = new Caretaker();
        // 初始化
        ori.setState1("中国");
        ori.setState2("强盛");
        ori.setState3("繁荣");
        System.out.println("初始化状态：" + ori);
        // 创建一个备忘录
        caretaker.setMemento(ori.createMemento());
        // 修改状态值
        ori.setState1("软件");
        ori.setState2("架构");
        ori.setState3("优秀");
        System.out.println("修改后的状态：" + ori.toString());
        // 恢复一个备忘录
        ori.restoreMemento(caretaker.getMemento());
        System.out.println("恢复后的状态：" + ori.toString());

        System.out.println("##################################################################");

        CaretakerMulti caretakerMulti = new CaretakerMulti();
        // 创建两个备忘录
        caretakerMulti.setMemMap("001", ori.createMemento());
        caretakerMulti.setMemMap("002", ori.createMemento());
        //恢复一个指定的备忘录
        ori.restoreMemento(caretakerMulti.getMemMap("001"));

        System.out.println("##################################################################");


    }
}
