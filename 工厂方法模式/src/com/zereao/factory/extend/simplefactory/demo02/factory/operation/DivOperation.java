package com.zereao.factory.extend.simplefactory.demo02.factory.operation;

/**
 * 除 操作
 *
 * @author Zereao
 * @version 2018/09/06  14:19
 */
public class DivOperation extends AbstractOperation {
    @Override
    public double getResult(double first, double second) {
        return first / second;
    }
}
