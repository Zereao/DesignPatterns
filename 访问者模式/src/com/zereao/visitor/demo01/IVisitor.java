package com.zereao.visitor.demo01;

/**
 * 访问者接口
 *
 * @author Zereao
 * @version 2018/10/08  10:40
 */
public interface IVisitor {
    // 首先，定义我可以访问普通员工
    void visit(CommonEmployee employee);

    // 其次，我还可以访问部门经理
    void visit(Manager manager);

    // 统计所有员工工资的总和
    int getTotalSalary();
}
