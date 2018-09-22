package com.zereao.responsibilitychain.demo01;

/**
 * @author Zereao
 * @version 2018/09/22  20:25
 */
public class Husband extends AbstractHandler {
    public Husband() {
        super(HUSBAND_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("--------妻子向丈夫请示--------");
        System.out.println(women.getRequest());
        System.out.println("丈夫的答复是：同意\n");
    }
}
