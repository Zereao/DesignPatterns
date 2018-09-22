package com.zereao.template.demo02;

/**
 * 抽象悍马车模型
 *
 * @author Zereao
 * @version 2018/09/21  23:26
 */
public abstract class AbstractHummerModel {
    /**
     * 抽象模板中方法尽量设计为protected 类型，符合 迪米特法则
     */
    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    /**
     * 为了防止恶意操作，一般模板方法都加上final关键字，不允许被重写
     */
    public final void run() {
        this.start();
        this.engineBoom();
        this.alarm();
        this.stop();
    }
}
