package com.zereao.command.demo01;

/**
 * @author Zereao
 * @version 2018/09/22  18:50
 */
public class DeletePageCommand extends AbstractCommand {
    @Override
    public void execute() {
        super.pageGroup.find();
        super.pageGroup.delete();
        super.pageGroup.plan();
    }
}
