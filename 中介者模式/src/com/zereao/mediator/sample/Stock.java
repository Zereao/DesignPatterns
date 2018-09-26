package com.zereao.mediator.sample;

/**
 * 库存管理
 *
 * @author Zereao
 * @version 2018/09/26  14:01
 */
public class Stock {
    private static int COMPUTER_NUM = 100;

    public void increase(int num) {
        COMPUTER_NUM += num;
        System.out.println("库存容量为：" + COMPUTER_NUM);
    }

    public void decrease(int num) {
        COMPUTER_NUM -= num;
        System.out.println("库存容量为：" + COMPUTER_NUM);
    }

    public int getStockNum() {
        return COMPUTER_NUM;
    }

    public void clearStock() {
        Purchase purchase = new Purchase();
        Sale sale = new Sale();
        System.out.println("清理存货数量为：" + COMPUTER_NUM);
        sale.offSale();
        purchase.refuseBuyIbm();
    }

}
