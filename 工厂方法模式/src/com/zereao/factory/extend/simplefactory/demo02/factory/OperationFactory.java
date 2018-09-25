package com.zereao.factory.extend.simplefactory.demo02.factory;


import com.zereao.factory.extend.simplefactory.demo02.factory.operation.*;

/**
 * 操作工厂，解决对象的创建问题
 *
 * @author Zereao
 * @version 2018/09/06  14:20
 */
public class OperationFactory {
    public static AbstractOperation getOperation(String quotaFlag) {
        AbstractOperation operation = null;
        switch (quotaFlag) {
            case "+":
                operation = new AddOperation();
                break;
            case "-":
                operation = new SubOperation();
                break;
            case "*":
                operation = new MulOperation();
                break;
            case "/":
                operation = new DivOperation();
                break;
            default:
                break;
        }
        return operation;
    }
}
