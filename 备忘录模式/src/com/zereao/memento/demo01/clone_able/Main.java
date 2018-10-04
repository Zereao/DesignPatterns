package com.zereao.memento.demo01.clone_able;

/**
 * @author Zereao
 * @version 2018/10/04  21:50
 */
public class Main {
    public static void main(String[] args) {
        BoyCloneable boy = new BoyCloneable();
        boy.setState("心情很棒！");
        System.out.println("男孩现在的状态:" + boy.getState());
        // 需要记录现在的状态
        boy.createMemento();
        // 状态改变了
        boy.setState("状态改遍了。。。");
        System.out.println("男孩现在的状态：" + boy.getState());
        // 失败，返回原样
        boy.restoreMemento();
        System.out.println("男孩现在的状态：" + boy.getState());
    }
}
