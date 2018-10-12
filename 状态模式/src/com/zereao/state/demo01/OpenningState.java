package com.zereao.state.demo01;

/**
 * @author Zereao
 * @version 2018/10/12  13:54
 */
public class OpenningState extends AbstractLiftState {

    @Override
    public void open() {
        System.out.println("电梯门开启...。。");
    }

    @Override
    public void close() {
        // 状态修改
        super.context.setState(Context.CLOSING_STATE);
    }

    @Override
    public void run() {
        // do nothing
    }

    @Override
    public void stop() {
        // do nothing
    }
}
