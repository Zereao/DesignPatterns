package com.zereao.state.demo01;

/**
 * 抽象电梯状态
 *
 * @author Zereao
 * @version 2018/10/12  11:11
 */
public abstract class AbstractLiftState {
    // 定义一个环境角色，也就是封装状态的变化引起的功能变化
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    // 电梯门开启
    public abstract void open();

    // 电梯门关闭
    public abstract void close();

    // 电梯能上下，运行
    public abstract void run();

    //电梯能停下来
    public abstract void stop();
}
