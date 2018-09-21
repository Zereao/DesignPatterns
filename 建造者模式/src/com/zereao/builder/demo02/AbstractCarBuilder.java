package com.zereao.builder.demo02;

import java.util.List;

/**
 * @author Zereao
 * @version 2018/09/20  20:24
 */
public abstract class AbstractCarBuilder {
    public abstract void setSequence(List<String> sequenceList);

    public abstract AbstractCarModel getCarModel();
}
