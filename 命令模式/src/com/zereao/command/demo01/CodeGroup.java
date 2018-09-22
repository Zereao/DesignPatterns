package com.zereao.command.demo01;

/**
 * @author Zereao
 * @version 2018/09/22  18:42
 */
public class CodeGroup extends AbstractGroup {
    @Override
    public void find() {
        System.out.println("找到代码组");
    }

    @Override
    public void add() {
        System.out.println("客户新增一项功能开发");
    }

    @Override
    public void delete() {
        System.out.println("客户删除一个功能");
    }

    @Override
    public void change() {
        System.out.println("客户更改一处代码功能");
    }

    @Override
    public void plan() {
        System.out.println("客户要求给代码开发计划");
    }
}
