package com.zereao.facade.demo01;

/**
 * @author Zereao
 * @version 2018/10/04  17:13
 */
public interface ILetterProcess {
    // 写信的内容
    void writeContext(String context);

    // 其次写信封信息
    void fillEnvelope(String address);

    // 把信放到信封里
    void letterIntoEnvolope();

    // 发信
    void sendLetter();
}
