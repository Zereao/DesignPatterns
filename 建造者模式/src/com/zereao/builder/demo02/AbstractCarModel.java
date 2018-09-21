package com.zereao.builder.demo02;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zereao
 * @version 2018/09/20  20:16
 */
public abstract class AbstractCarModel {
    // 这个参数是各个基本方法执行的顺序
    private List<String> sequenceList = new ArrayList<>();

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    public final void run() {
        for (String action : sequenceList) {
            switch (action) {
                case "start":
                    this.start();
                    break;
                case "stop":
                    this.stop();
                    break;
                case "alarm":
                    this.alarm();
                    break;
                case "engineBoom":
                    this.engineBoom();
                    break;
                default:
                    break;
            }
        }
    }

    public void setSequenceList(List<String> sequenceList) {
        this.sequenceList = sequenceList;
    }
}
