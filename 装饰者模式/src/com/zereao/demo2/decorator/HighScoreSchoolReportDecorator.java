package com.zereao.demo2.decorator;

import com.zereao.demo2.AbstractSchoolReport;

/**
 * 最高成绩修饰
 *
 * @author Zereao
 * @version 2018/09/14  11:18
 */
public class HighScoreSchoolReportDecorator extends AbstractSchoolReportDecorator {
    public HighScoreSchoolReportDecorator(AbstractSchoolReport schoolReport) {
        super(schoolReport);
    }

    /**
     * 汇报最高成绩
     */
    private void reportHighScore() {
        System.out.println("这次考试语文最高的是75，数学是78，自然是80");
    }

    @Override
    public void report() {
        this.reportHighScore();
        super.report();
    }
}
