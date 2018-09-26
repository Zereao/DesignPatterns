package com.zereao.mediator.demo01;

import java.util.Random;

/**
 * @author Zereao
 * @version 2018/09/26  15:35
 */
public class Sale extends AbstractColleague {

    public Sale(AbstractMediator mediator) {
        super(mediator);
    }

    public void sellIbmComputer(int number) {
        super.mediator.execute("sale.sell", number);
        System.out.println("销售IBM电脑" + number + "台");
    }

    public int getSaleStatus() {
        Random random = new Random(System.currentTimeMillis());
        // 反馈销售情况，0-100 之间变化，0代表没人买，100代表非常畅销
        int saleStatus = random.nextInt(100);
        System.out.println("IBM销售情况为" + saleStatus);
        return saleStatus;
    }

    public void offSale() {
        super.mediator.execute("sale.offsell");
    }

}
