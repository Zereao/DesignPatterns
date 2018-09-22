package com.zereao.command.demo01;

/**
 * @author Zereao
 * @version 2018/09/22  18:46
 */
public abstract class AbstractCommand {
    // 把三个group 定义好，子类可以直接用
    protected AbstractGroup requirementGroup = new RequirementGroup();
    protected AbstractGroup pageGroup = new PageGroup();
    protected AbstractGroup codeGroup = new CodeGroup();

    // 只有一个方法：要做什么事情
    public abstract void execute();
}
