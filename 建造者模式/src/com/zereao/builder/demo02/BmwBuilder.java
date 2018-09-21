package com.zereao.builder.demo02;

import java.util.List;

/**
 * @author Zereao
 * @version 2018/09/20  20:27
 */
public class BmwBuilder extends AbstractCarBuilder {
    private AbstractCarModel bmwModel = new BmwModel();

    @Override
    public void setSequence(List<String> sequenceList) {
        this.bmwModel.setSequenceList(sequenceList);
    }

    @Override
    public AbstractCarModel getCarModel() {
        return this.bmwModel;
    }
}
