package com.zereao.prototype.demo01;

/**
 * 《设计模式之禅》中的范例
 *
 * @author Zereao
 * @version 2018/09/21  23:44
 */
public class Mail {
    private String receiver;
    private String subject;
    private String name;
    private String content;
    private String tail;

    public Mail(AdvTemplate advTemplate) {
        this.content = advTemplate.getAdvContent();
        this.subject = advTemplate.getAdvSubject();
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }
}
