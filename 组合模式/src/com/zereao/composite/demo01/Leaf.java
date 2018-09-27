package com.zereao.composite.demo01;

/**
 * @author Zereao
 * @version 2018/09/27  19:19
 */
public class Leaf extends AbstractCrop {
    //　就写一个构造函数，这是必须的
    public Leaf(String name, String position, int salary) {
        super(name, position, salary);
    }
}

