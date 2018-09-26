package com.zereao.mediator.demo01;

/**
 * @author Zereao
 * @version 2018/09/26  15:29
 */
public class Stock extends AbstractColleague {

    public Stock(AbstractMediator mediator) {
        super(mediator);
    }

    private static int COMPUTER_NUMBER = 100;

    public void increase(int num) {
        COMPUTER_NUMBER += num;
        System.out.println("库存数量为：" + COMPUTER_NUMBER);
    }

    public void decrease(int num) {
        COMPUTER_NUMBER -= num;
        System.out.println("库存数量为：" + COMPUTER_NUMBER);
    }

    public int getStockNum() {
        return COMPUTER_NUMBER;
    }

    public void clearStock() {
        System.out.println("清理存货数量为：" + COMPUTER_NUMBER);
        super.mediator.execute("stock.clear");
    }
}
