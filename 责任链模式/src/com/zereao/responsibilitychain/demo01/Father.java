package com.zereao.responsibilitychain.demo01;

/**
 * @author Zereao
 * @version 2018/09/22  20:22
 */
public class Father extends AbstractHandler {
    // 父亲只能处理女儿的请求
    public Father() {
        super(FATHER_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("--------女儿向父亲请示--------");
        System.out.println(women.getRequest());
        System.out.println("父亲的答复是：同意\n");
    }
}
