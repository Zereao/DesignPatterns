package com.zereao.state.demo01;

/**
 * @author Zereao
 * @version 2018/10/12  14:58
 */
public class ClosingState extends AbstractLiftState {

    @Override
    public void open() {
        super.context.setState(Context.OPENNING_STATE);
        super.context.getState().open();
    }

    @Override
    public void close() {
        System.out.println("电梯门关闭状态的逻辑");
    }

    @Override
    public void run() {
        super.context.setState(Context.RUNNING_STATE);
//        this.context.run();
        super.context.getState().run();
//        super.context.run();
    }

    @Override
    public void stop() {
        super.context.setState(Context.STOPPING_STATE);
        super.context.getState().stop();
    }
}
