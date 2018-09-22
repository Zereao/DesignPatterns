package com.zereao.command.demo01;

/**
 * 负责人
 *
 * @author Zereao
 * @version 2018/09/22  18:51
 */
public class Invoker {
    // 什么命令
    private AbstractCommand command;

    //客户发出（设置）命令
    public void setCommand(AbstractCommand command) {
        this.command = command;
    }

    // 执行客户的命令
    public void action() {
        this.command.execute();
    }
}
