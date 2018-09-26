package com.zereao.mediator.demo01;

import java.util.Objects;

/**
 * 具体中介者
 *
 * @author Zereao
 * @version 2018/09/26  14:53
 */
public class Mediator extends AbstractMediator {

    @Override
    public void execute(String str, Object... objects) {
        if (Objects.equals(str, "purchase.buy")) {
            this.buyComputer((Integer) objects[0]);
        } else if (Objects.equals(str, "sale.sell")) {
            this.sellComputer((Integer) objects[0]);
        } else if (Objects.equals(str, "sale.offsell")) {
            this.offSell();
        } else if (Objects.equals(str, "stock.clear")) {
            this.clearStock();
        }
    }

    private void buyComputer(int number) {
        int saleStatus = super.sale.getSaleStatus();
        if (saleStatus > 80) {
            // 销售情况良好
            System.out.println("采购IBM电脑：" + number + "台");
            super.stock.increase(number);
        } else {
            // 销售对象不好，折半采购
            int buyNumber = number / 2;
            System.out.println("采购IBM电脑：" + buyNumber + "台");
        }
    }

    private void sellComputer(int number) {
        if (super.stock.getStockNum() < number) {
            // 库存数量不够销售
            super.purchase.buyIbmComputer(number);
        }
        super.stock.decrease(number);
    }

    private void offSell() {
        System.out.println("折价销售IBM电脑" + stock.getStockNum() + "台");
    }

    private void clearStock() {
        super.sale.offSale();
        super.purchase.refuseBuyIbm();
    }

}
