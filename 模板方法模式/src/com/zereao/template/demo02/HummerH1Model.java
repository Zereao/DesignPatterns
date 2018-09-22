package com.zereao.template.demo02;

/**
 * 悍马H1模型
 *
 * @author Zereao
 * @version 2018/09/21  23:30
 */
public class HummerH1Model extends AbstractHummerModel {
    @Override
    public void start() {
        System.out.println("悍马H1启动");
    }

    @Override
    public void stop() {
        System.out.println("悍马H1停下来");
    }

    @Override
    public void alarm() {
        System.out.println("悍马H1鸣笛");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马H1引擎轰鸣");
    }

    /* 模板方法交由父类
    @Override
    public void run() {
        this.start();
        this.engineBoom();
        this.alarm();
        this.stop();
    }
    */
}
