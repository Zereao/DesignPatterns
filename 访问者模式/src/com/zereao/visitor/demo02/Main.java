package com.zereao.visitor.demo02;

import java.util.ArrayList;
import java.util.List;

/**
 * 《设计模式之禅》范例
 *
 * @author Zereao
 * @version 2018/10/08  10:32
 */
public class Main {
    public static void main(String[] args) {
        // 展示报表访问者
        IShowVisitor showVisitor = new ShowVisitor();
        // 汇总访问者
        ITotalVisitor totalVisitor = new TotalVisitor();
        for (AbstractEmployee employee : mockEmployeeList()) {
            employee.accept(showVisitor);
            employee.accept(totalVisitor);
        }
        showVisitor.report();
        totalVisitor.totalSalary();
    }

    // 模拟出公司人员情况,我们可以想象这个数据是通过持久层传递过来的
    public static List<AbstractEmployee> mockEmployeeList() {
        List<AbstractEmployee> employeeList = new ArrayList<>();
        CommonEmployee zhangSan = new CommonEmployee();
        zhangSan.setJob("编写Java程序,绝对的蓝领,苦工加搬运工");
        zhangSan.setName("张三");
        zhangSan.setSalary(1800);
        zhangSan.setSex(AbstractEmployee.MALE);
        employeeList.add(zhangSan);
        //产生李四这个员工
        CommonEmployee liSi = new CommonEmployee();
        liSi.setJob("页面美工,审美素质太不流行了！");
        liSi.setName("李四");
        liSi.setSalary(1900);
        liSi.setSex(AbstractEmployee.FAMALE);
        employeeList.add(liSi);
        //再产生一个经理
        Manager wangWu = new Manager();
        wangWu.setName("王五");
        wangWu.setPerformance("基本上是负值,但是我会拍马屁呀");
        wangWu.setSalary(18750);
        wangWu.setSex(AbstractEmployee.MALE);
        employeeList.add(wangWu);
        return employeeList;
    }
}
