package com.zereao.factory.extend.simplefactory.demo02.factory.operation;

/**
 * 减 操作
 *
 * @author Zereao
 * @version 2018/09/06  14:17
 */
public class SubOperation extends AbstractOperation {
    @Override
    public double getResult(double first, double second) {
        return first - second;
    }
}
