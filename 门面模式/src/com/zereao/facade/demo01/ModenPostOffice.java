package com.zereao.facade.demo01;

/**
 * @author Zereao
 * @version 2018/10/04  17:17
 */
public class ModenPostOffice {
    private ILetterProcess letterProcess = new ILetterProcessImpl();

    private Police police = new Police();

    // 写信、封装、投递一体化
    public void sendLetter(String context, String address) {
        letterProcess.writeContext(context);
        police.checkLetter(this.letterProcess);
        letterProcess.fillEnvelope(address);
        letterProcess.letterIntoEnvolope();
        letterProcess.sendLetter();
    }
}
