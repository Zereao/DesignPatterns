package com.zereao.visitor.demo02;

/**
 * @author Zereao
 * @version 2018/10/08  10:38
 */
public class CommonEmployee extends AbstractEmployee {
    // 工作类容
    private String job;

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
