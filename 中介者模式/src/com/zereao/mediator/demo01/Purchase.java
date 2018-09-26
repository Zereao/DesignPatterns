package com.zereao.mediator.demo01;

/**
 * @author Zereao
 * @version 2018/09/26  15:22
 */
public class Purchase extends AbstractColleague {

    public Purchase(AbstractMediator mediator) {
        super(mediator);
    }

    public void buyIbmComputer(int number) {
        super.mediator.execute("purchase.bug", number);
    }

    public void refuseBuyIbm() {
        System.out.println("不要再采购IBM电脑");
    }


}
