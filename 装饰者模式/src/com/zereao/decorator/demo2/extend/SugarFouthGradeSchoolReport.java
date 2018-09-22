package com.zereao.decorator.demo2.extend;

/**
 * 修饰成绩单
 *
 * @author Zereao
 * @version 2018/09/14  11:03
 */
public class SugarFouthGradeSchoolReport extends FouthGradeSchoolReport {
    // 首先要定义你美化的方法，先给老爸说学校的最高成绩
    private void reportHighScore() {
        System.out.println("这次考试语文最高的是75，数学是78，自然是80");
    }

    // 在老爸看完成绩单后，我再回报学校的排名情况
    private void reportSort() {
        System.out.println("我的排名是第38名...");
    }

    /**
     * 由于汇报的内容已经发生改变，那所以要重写父类
     */
    @Override
    public void report() {
        // 先说最高成绩
        this.reportHighScore();
        // 然后老爸看成绩单
        super.report();
        // 然后告诉老爸学校排名
        this.reportSort();
    }
}
