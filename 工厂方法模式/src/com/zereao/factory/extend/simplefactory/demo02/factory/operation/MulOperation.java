package com.zereao.factory.extend.simplefactory.demo02.factory.operation;

/**
 * 乘 操作
 *
 * @author Zereao
 * @version 2018/09/06  14:18
 */
public class MulOperation extends AbstractOperation {
    @Override
    public double getResult(double first, double second) {
        return first * second;
    }
}
