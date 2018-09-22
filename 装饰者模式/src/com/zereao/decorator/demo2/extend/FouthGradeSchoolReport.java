package com.zereao.decorator.demo2.extend;

import com.zereao.decorator.demo2.AbstractSchoolReport;

/**
 * 四年级成绩单
 *
 * @author Zereao
 * @version 2018/09/14  11:00
 */
public class FouthGradeSchoolReport extends AbstractSchoolReport {
    // 我的成绩单
    @Override
    public void report() {
        // 成绩单是这样子的
        System.out.println("尊敬的XXX家长：");
        System.out.println("   ········   ");
        System.out.println("  语文 62   数学 65   体育 98   自然 63  ");
        System.out.println("   ········   ");
        System.out.println("                家长签名：           ");
    }

    // 家长签名
    @Override
    public void sign(String name) {
        System.out.println("家长签名为：" + name);
    }
}
