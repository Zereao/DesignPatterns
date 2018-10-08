package com.zereao.visitor.demo02;

/**
 * 汇总接口
 *
 * @author Zereao
 * @version 2018/10/08  11:46
 */
public interface ITotalVisitor extends IVisitor {
    // 汇总工资总和
    void totalSalary();
}
