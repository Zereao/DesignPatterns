package com.zereao.prototype.demo01;

import java.util.Random;

/**
 * 《设计模式之禅》范例
 *
 * @author Zereao
 * @version 2018/09/21  23:42
 */
public class Main {
    public static int MAX_COUNT = 6;

    /**
     * 线程不安全，非原型模式
     */
    public static void main1(String[] args) {
        int i = 0;
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("xx银行版权所有");
        while (i < MAX_COUNT) {
            mail.setName(getRandString(5) + "先生(女士)");
            mail.setReceiver(getRandString(5) + "@" + getRandString(8) + ".com");
            sendMail(mail);
            ++i;
        }
    }

    /**
     * 原型模式，使用拷贝生成对象
     */
    public static void main(String[] args) {
        int i = 0;
        MailCloneabel mail = new MailCloneabel(new AdvTemplate());
        mail.setTail("xx银行版权所有");
        while (i < MAX_COUNT) {
            MailCloneabel cloneMail = (MailCloneabel) mail.clone();
            mail.setName(getRandString(5) + "先生(女士)");
            mail.setReceiver(getRandString(5) + "@" + getRandString(8) + ".com");
            sendMail(cloneMail);
            ++i;
        }
    }

    public static void sendMail(Mail mail) {
        System.out.println("标题：" + mail.getSubject() + "\t收件人：" + mail.getReceiver() + "\t发送成功");
    }

    public static void sendMail(MailCloneabel mail) {
        System.out.println("标题：" + mail.getSubject() + "\t收件人：" + mail.getReceiver() + "\t发送成功");
    }

    public static String getRandString(int length) {
        String source = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(source.charAt(random.nextInt(source.length())));
        }
        return sb.toString();
    }
}
