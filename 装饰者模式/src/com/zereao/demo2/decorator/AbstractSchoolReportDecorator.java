package com.zereao.demo2.decorator;

import com.zereao.demo2.AbstractSchoolReport;

/**
 * 抽象修饰器
 *
 * @author Zereao
 * @version 2018/09/14  11:11
 */
public abstract class AbstractSchoolReportDecorator extends AbstractSchoolReport {
    private AbstractSchoolReport schoolReport;

    public AbstractSchoolReportDecorator(AbstractSchoolReport schoolReport) {
        this.schoolReport = schoolReport;
    }

    @Override
    public void report() {
        this.schoolReport.report();
    }

    @Override
    public void sign(String name) {
        this.schoolReport.sign(name);
    }
}
