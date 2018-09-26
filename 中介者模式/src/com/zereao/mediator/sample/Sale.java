package com.zereao.mediator.sample;

import java.util.Random;

/**
 * 销售管理
 *
 * @author Zereao
 * @version 2018/09/26  14:17
 */
public class Sale {
    public void sellIbmComputer(int num) {
        // 访问库存
        Stock stock = new Stock();
        // 访问采购
        Purchase purchase = new Purchase();
        if (stock.getStockNum() < num) {
            purchase.buyIbmComputer(num);
        }
        System.out.println("销售IBM电脑" + num + "台");
        stock.decrease(num);
    }

    public int getSaleStatus() {
        Random random = new Random(System.currentTimeMillis());
        // 反馈销售情况，0-100 之间变化，0代表没人买，100代表非常畅销
        int saleStatus = random.nextInt(100);
        System.out.println("IBM销售情况为" + saleStatus);
        return saleStatus;
    }

    public void offSale() {
        Stock stock = new Stock();
        System.out.println("折价销售IBM电脑" + stock.getStockNum() + "台");
    }
}
