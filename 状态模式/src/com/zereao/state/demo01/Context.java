package com.zereao.state.demo01;

/**
 * 上下文类
 * Context是一个环境角色，它的作用是串联各个状态的过渡
 *
 * @author Zereao
 * @version 2018/10/12  14:51
 */
public class Context {
    // 定义出所有的电梯状态
    public static final OpenningState OPENNING_STATE = new OpenningState();
    public static final RunningState RUNNING_STATE = new RunningState();
    public static final ClosingState CLOSING_STATE = new ClosingState();
    public static final StoppingState STOPPING_STATE = new StoppingState();

    private AbstractLiftState state;

    public void setState(AbstractLiftState state) {
        this.state = state;
        // 把当前的环境通知到各个实现类中
        this.state.setContext(this);
    }

    public AbstractLiftState getState() {
        return state;
    }

    public void open() {
        this.state.open();
    }

    public void close() {
        this.state.close();
    }

    public void run() {
        this.state.run();
    }

    public void stop() {
        this.state.stop();
    }

}
