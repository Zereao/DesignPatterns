package com.zereao.visitor.demo02;

/**
 * @author Zereao
 * @version 2018/10/08  10:39
 */
public class Manager extends AbstractEmployee {
    // 这个人物的职责：业绩
    private String performance;

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }
}
