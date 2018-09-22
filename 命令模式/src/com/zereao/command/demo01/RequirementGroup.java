package com.zereao.command.demo01;

/**
 * @author Zereao
 * @version 2018/09/22  18:39
 */
public class RequirementGroup extends AbstractGroup {
    @Override
    public void find() {
        System.out.println("找到需求组");
    }

    @Override
    public void add() {
        System.out.println("客户新增一项需求");
    }

    @Override
    public void delete() {
        System.out.println("客户删除一项需求");
    }

    @Override
    public void change() {
        System.out.println("客户修改一项需求");
    }

    @Override
    public void plan() {
        System.out.println("客户要求给出 需求变更计划");
    }
}
