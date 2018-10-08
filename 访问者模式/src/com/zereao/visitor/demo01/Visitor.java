package com.zereao.visitor.demo01;

/**
 * @author Zereao
 * @version 2018/10/08  10:42
 */
public class Visitor implements IVisitor {

    // 访问普通员工，打印出报表
    @Override
    public void visit(CommonEmployee employee) {
        System.out.println(this.getCommonEmployeeInfo(employee));
    }

    @Override
    public void visit(Manager manager) {
        System.out.println(this.getManagerInfo(manager));
    }

    private String getBasicInfo(AbstractEmployee employee) {
        return "name='" + employee.getName() + '\'' +
                ", salary=" + employee.getSalary() +
                ", sex='" + employee.getSex() + '\'';
    }

    private String getManagerInfo(Manager manager) {
        return this.getBasicInfo(manager) + ", 业绩=" + manager.getPerformance();
    }

    private String getCommonEmployeeInfo(CommonEmployee employee) {
        return this.getBasicInfo(employee) + ", 工作=" + employee.getJob();
    }

    //　扩展部分的代码
    // 部门经理的工资系数是 5
    private static final int MANAGER_COFFICIENT = 5;
    // 员工的工资系数是 5
    private static final int COMMONEMPLOYEE_COFFICIENT = 2;

    // 部门经理的工资总和
    private int managerTotalSalary = 0;
    // 普通员工的工资总和
    private int commonemployeeTotalSalary = 0;

    @Override
    public int getTotalSalary() {
        return this.commonemployeeTotalSalary + this.managerTotalSalary;
    }

    // 计算部门经理的工资总和
    private void calManagerTotalSalary(int salary) {
        this.managerTotalSalary = this.managerTotalSalary + salary * MANAGER_COFFICIENT;
    }

    // 计算部门经理的工资总和
    private void calCommonemployeeTotalSalary(int salary) {
        this.commonemployeeTotalSalary = this.commonemployeeTotalSalary + salary * COMMONEMPLOYEE_COFFICIENT;
    }
}
