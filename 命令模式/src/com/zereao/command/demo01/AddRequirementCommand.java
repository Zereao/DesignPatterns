package com.zereao.command.demo01;

/**
 * @author Zereao
 * @version 2018/09/22  18:49
 */
public class AddRequirementCommand extends AbstractCommand {
    @Override
    public void execute() {
        super.requirementGroup.find();
        super.requirementGroup.add();
        // 注意这种扩展
        super.pageGroup.add();
        super.codeGroup.add();

        super.requirementGroup.plan();
    }
}
