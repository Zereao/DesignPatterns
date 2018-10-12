package com.zereao.state.demo01;

/**
 * @author Zereao
 * @version 2018/10/12  15:09
 */
public class StoppingState extends AbstractLiftState {

    @Override
    public void open() {
        // 如果需要开门
        super.context.setState(Context.OPENNING_STATE);
        super.context.getState().open();
    }

    @Override
    public void close() {
        // do nothing
    }

    @Override
    public void run() {
        super.context.setState(Context.RUNNING_STATE);
        super.context.getState().run();
    }

    @Override
    public void stop() {
        System.out.println("电梯停止的逻辑");
    }
}
