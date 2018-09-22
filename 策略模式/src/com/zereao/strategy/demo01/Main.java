package com.zereao.strategy.demo01;

/**
 * 《设计模式之禅》中的示例
 *
 * @author Zereao
 * @version 2018/09/22  21:15
 */
public class Main {
    public static void main(String[] args) {
        Context context = null;
        System.out.println("刚到吴国的时候拆开第一个锦囊");
        // 第一条策略
        context = new Context(new BackDoor());
        // 开始执行策略
        context.operate();
        //　第二条策略
        context = new Context(new GivenGreenLight());
        context.operate();
        // 第三条策略
        context = new Context(new BlockEnemy());
        context.operate();
    }
}
