package com.zereao.visitor.demo02;

/**
 * @author Zereao
 * @version 2018/10/08  11:46
 */
public class TotalVisitor implements ITotalVisitor {
    // 部门经理的工资系数是 5
    private static final int MANAGER_COFFICIENT = 5;
    // 员工的工资系数是 5
    private static final int COMMONEMPLOYEE_COFFICIENT = 2;

    // 部门经理的工资总和
    private int managerTotalSalary = 0;
    // 普通员工的工资总和
    private int commonemployeeTotalSalary = 0;

    @Override
    public void totalSalary() {
        System.out.println("本月的工资总额：" + (this.commonemployeeTotalSalary + this.managerTotalSalary));
    }

    // 访问普通员工，计算工资总和
    @Override
    public void visit(CommonEmployee employee) {
        this.commonemployeeTotalSalary = this.commonemployeeTotalSalary + employee.getSalary() * COMMONEMPLOYEE_COFFICIENT;
    }

    // 访问部门经理，计算工资总和
    @Override
    public void visit(Manager manager) {
        this.managerTotalSalary = this.managerTotalSalary + manager.getSalary() * MANAGER_COFFICIENT;
    }
}
