package com.zereao.state.demo01;

/**
 * @author Zereao
 * @version 2018/10/12  15:22
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new ClosingState());
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
