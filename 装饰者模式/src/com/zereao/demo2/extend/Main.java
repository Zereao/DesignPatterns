package com.zereao.demo2.extend;

import com.zereao.demo2.AbstractSchoolReport;

/**
 * extend包下，是《设计模式之禅》中的范例---利用继承实现<br>
 * 测试类，老爸查看修饰后的成绩单
 *
 * @author Zereao
 * @version 2018/09/14  10:52
 */
public class Main {
    public static void main(String[] args) {
        // 把美化过的成绩单拿过来
        AbstractSchoolReport schoolReport = new SugarFouthGradeSchoolReport();
        // 看成绩单
        schoolReport.report();
        schoolReport.sign("老三");
    }
}
