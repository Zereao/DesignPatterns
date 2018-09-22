package com.zereao.decorator.demo2.decorator;

import com.zereao.decorator.demo2.AbstractSchoolReport;
import com.zereao.decorator.demo2.extend.FouthGradeSchoolReport;

/**
 * 测试类-《设计模式之禅》中的范例
 *
 * @author Zereao
 * @version 2018/09/14  11:25
 */
public class Main {
    public static void main(String[] args) {
        //成绩单拿过来
        AbstractSchoolReport schoolReport;
        // 原装的成绩单
        schoolReport = new FouthGradeSchoolReport();
        // 加了最高分说明的成绩单
        schoolReport = new HighScoreSchoolReportDecorator(schoolReport);
        // 又加了成绩排名的成绩单
        schoolReport = new SortDecorator(schoolReport);
        // 老爸看成绩单
        schoolReport.report();
        // 签名
        schoolReport.sign("老三");
    }
}
