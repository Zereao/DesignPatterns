package com.zereao.state.demo01;

/**
 * @author Zereao
 * @version 2018/10/12  15:07
 */
public class RunningState extends AbstractLiftState {

    @Override
    public void open() {
        /*
         *运行的时候不开电梯门
         * do nothing
         */
    }

    @Override
    public void close() {
        // do nothing
    }

    @Override
    public void run() {
        System.out.println("这里是运行状态下，需要执行的逻辑");
    }

    @Override
    public void stop() {

    }
}
