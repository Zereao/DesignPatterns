package com.zereao.visitor.demo02;

/**
 * 具体展示报表
 *
 * @author Zereao
 * @version 2018/10/08  11:42
 */
public class ShowVisitor implements IShowVisitor {
    private String info = null;

    @Override
    public void report() {
        System.out.println(this.info);
    }

    @Override
    public void visit(CommonEmployee employee) {
        this.info = this.info + this.getBasicInfo(employee) + ", 工作：" + employee.getJob() + "\t\n";
    }

    @Override
    public void visit(Manager manager) {
        this.info = this.info + this.getBasicInfo(manager) + ", 工作：" + manager.getPerformance() + "\t\n";
    }

    private String getBasicInfo(AbstractEmployee employee) {
        return "name='" + employee.getName() + '\'' +
                ", salary=" + employee.getSalary() +
                ", sex='" + employee.getSex() + '\'';
    }
}
