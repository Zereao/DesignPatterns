package com.zereao.facade.demo01;

/**
 * @author Zereao
 * @version 2018/10/04  17:14
 */
public class ILetterProcessImpl implements ILetterProcess {
    @Override
    public void writeContext(String context) {
        System.out.println("填写信的内容：" + context);
    }

    @Override
    public void fillEnvelope(String address) {
        System.out.println("填写收件人姓名及地址：" + address);
    }

    @Override
    public void letterIntoEnvolope() {
        System.out.println("把信放入邮筒。。。");
    }

    @Override
    public void sendLetter() {
        System.out.println("邮递信件。。。。");
    }
}
