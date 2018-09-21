package com.zereao.builder.demo02;

import java.util.List;

/**
 * @author Zereao
 * @version 2018/09/20  20:25
 */
public class BenzBuilder extends AbstractCarBuilder {
    private AbstractCarModel benzModel = new BenzModel();

    @Override
    public void setSequence(List<String> sequenceList) {
        this.benzModel.setSequenceList(sequenceList);
    }

    @Override
    public AbstractCarModel getCarModel() {
        return this.benzModel;
    }
}
