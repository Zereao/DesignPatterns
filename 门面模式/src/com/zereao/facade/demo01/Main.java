package com.zereao.facade.demo01;

/**
 * 《设计模式之禅》中的范例
 *
 * @author Zereao
 * @version 2018/09/22  23:46
 */
public class Main {
    public static void main(String[] args) {
        ModenPostOffice sender = new ModenPostOffice();
        String address = "ADDRESS!";
        String context = "CONTEXT=CONTENT";
        sender.sendLetter(context, address);
    }
}
