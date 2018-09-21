package com.zereao.builder.demo02;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zereao
 * @version 2018/09/20  20:31
 */
public class Director {
    private List<String> sequenceList = new ArrayList<>();
    private AbstractCarBuilder benzBuilder = new BenzBuilder();
    private AbstractCarBuilder bmwBuilder = new BmwBuilder();

    public BenzModel getBenzModelA() {
        // 清理场景，这是一些初级程序员不注意的地方
        this.sequenceList.clear();
        this.sequenceList.add("start");
        this.sequenceList.add("stop");
        this.benzBuilder.setSequence((this.sequenceList));
        return (BenzModel) this.benzBuilder.getCarModel();
    }

    public BenzModel getBenzModelB() {
        // 清理场景，这是一些初级程序员不注意的地方
        this.sequenceList.clear();
        this.sequenceList.add("engineBoom");
        this.sequenceList.add("start");
        this.sequenceList.add("stop");
        this.benzBuilder.setSequence((this.sequenceList));
        return (BenzModel) this.benzBuilder.getCarModel();
    }

    public BmwModel getBmwModelA() {
        // 清理场景，这是一些初级程序员不注意的地方
        this.sequenceList.clear();
        this.sequenceList.add("alarm");
        this.sequenceList.add("start");
        this.sequenceList.add("stop");
        this.bmwBuilder.setSequence((this.sequenceList));
        return (BmwModel) this.bmwBuilder.getCarModel();
    }
    public BmwModel getBmwModelB() {
        // 清理场景，这是一些初级程序员不注意的地方
        this.sequenceList.clear();
        this.sequenceList.add("start");
        this.bmwBuilder.setSequence((this.sequenceList));
        return (BmwModel) this.bmwBuilder.getCarModel();
    }

}
