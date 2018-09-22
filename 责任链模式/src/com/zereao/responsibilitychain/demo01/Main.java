package com.zereao.responsibilitychain.demo01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 《设计模式之禅》中的范例
 *
 * @author Zereao
 * @version 2018/09/22  20:06
 */
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        List<IWomen> womenList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            womenList.add(new Women(random.nextInt(4), "我要出去逛街"));
        }
        // 定义是哪个请示对象
        AbstractHandler father = new Father();
        AbstractHandler husband = new Husband();
        AbstractHandler son = new Son();
        //设置请示顺序
        father.setNextHandler(husband);
        husband.setNextHandler(son);
        for (IWomen women : womenList) {
            System.out.println(women.getType());
            father.handleMessage(women);

            System.out.println("$$$$$$$$$$$$$$$$$$$$$");
        }
    }
}
