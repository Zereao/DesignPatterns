package com.zereao.command.demo01;

/**
 * @author Zereao
 * @version 2018/09/22  18:41
 */
public class PageGroup extends AbstractGroup {
    @Override
    public void find() {
        System.out.println("找到美工组");
    }

    @Override
    public void add() {
        System.out.println("客户新增一个页面");
    }

    @Override
    public void delete() {
        System.out.println("客户删除一个页面");
    }

    @Override
    public void change() {
        System.out.println("客户修改一个页面");
    }

    @Override
    public void plan() {
        System.out.println("客户要求给出页面变更计划");
    }
}
