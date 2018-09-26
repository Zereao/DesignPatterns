package com.zereao.mediator.demo01;

/**
 * @author Zereao
 * @version 2018/09/26  15:20
 */
public abstract class AbstractColleague {
    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator mediator) {
        this.mediator = mediator;
    }
}
