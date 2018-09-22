package com.zereao.decorator.demo2.decorator;

import com.zereao.decorator.demo2.AbstractSchoolReport;

/**
 * 排名情况修饰
 *
 * @author Zereao
 * @version 2018/09/14  11:22
 */
public class SortDecorator extends AbstractSchoolReportDecorator {
    public SortDecorator(AbstractSchoolReport schoolReport) {
        super(schoolReport);
    }

    /**
     * 汇报排名情况
     */
    private void reportSort() {
        System.out.println("我的排名是第38名...");
    }

    /**
     * 报告情况
     */
    @Override
    public void report() {
        super.report();
        this.reportSort();
    }
}
