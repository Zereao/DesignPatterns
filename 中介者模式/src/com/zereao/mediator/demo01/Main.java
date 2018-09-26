package com.zereao.mediator.demo01;

/**
 * @author Zereao
 * @version 2018/09/26  15:42
 */
public class Main {
    public static void main(String[] args) {
        AbstractMediator mediator = new Mediator();
        Purchase purchase = new Purchase(mediator);
        purchase.buyIbmComputer(100);
        Sale sale = new Sale(mediator);
        sale.sellIbmComputer(1);
        Stock stock = new Stock(mediator);
        stock.clearStock();
    }
}
