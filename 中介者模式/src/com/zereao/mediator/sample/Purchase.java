package com.zereao.mediator.sample;

/**
 * @author Zereao
 * @version 2018/09/26  14:00
 */
public class Purchase {
    public void buyIbmComputer(int num) {
        Stock stock = new Stock();
        Sale sale = new Sale();
        int saleStatus = sale.getSaleStatus();
        if (saleStatus > 80) {
            System.out.println("采购IBM电脑" + num + "台");
            stock.increase(num);
        } else {
            int buyNum = num / 2;
            System.out.println("采购IBM电脑" + buyNum + "台");
        }
    }

    public void refuseBuyIbm() {
        System.out.println("不要再采购IBM电脑");
    }
}
