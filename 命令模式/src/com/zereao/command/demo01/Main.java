package com.zereao.command.demo01;

/**
 * 《设计模式之禅》中的范例
 *
 * @author Zereao
 * @version 2018/09/22  18:57
 */
public class Main {
    public static void main(String[] args) {
        // 定义我们的交接人
        Invoker jiaoJie = new Invoker();
        // 客户新增一项需求
        System.out.println("---------------客户要求新增一项需求--------------");
        // 客户命令来
        AbstractCommand addRequirementCommand = new AddRequirementCommand();
        // 接头人收到命令
        jiaoJie.setCommand(addRequirementCommand);
        // 接头人执行命令
        jiaoJie.action();
        System.out.println();
        AbstractCommand deletePageCommand = new DeletePageCommand();
        jiaoJie.setCommand(deletePageCommand);
        jiaoJie.action();
    }
}
