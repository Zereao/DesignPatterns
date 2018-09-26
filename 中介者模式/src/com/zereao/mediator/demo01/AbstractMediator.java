package com.zereao.mediator.demo01;

/**
 * 抽象终结者
 *
 * @author Zereao
 * @version 2018/09/26  14:38
 */
public abstract class AbstractMediator {
    protected Purchase purchase;
    protected Sale sale;
    protected Stock stock;

    public AbstractMediator() {
        this.purchase = new Purchase(this);
        this.sale = new Sale(this);
        this.stock = new Stock(this);
    }

    /**
     * 中介者最为重要的方法叫做事件方法，处理过个对象之间的关系
     */
    public abstract void execute(String str, Object... objects);
}
