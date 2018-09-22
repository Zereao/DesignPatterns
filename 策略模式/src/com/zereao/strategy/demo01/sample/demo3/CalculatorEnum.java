package com.zereao.strategy.demo01.sample.demo3;

/**
 * 策略枚举 ***
 *
 * @author Zereao
 * @version 2018/09/22  22:10
 */
@SuppressWarnings("AlibabaEnumConstantsMustHaveComment")
public enum CalculatorEnum {
    /***/
    ADD("+") {
        @Override
        public int exec(int a, int b) {
            return a + b;
        }
    },
    SUB("-") {
        @Override
        public int exec(int a, int b) {
            return a - b;
        }
    };

    String value = null;

    CalculatorEnum(String value) {
        this.value = value;
    }


    public String getValue() {
        return value;
    }

    public abstract int exec(int a, int b);
}
