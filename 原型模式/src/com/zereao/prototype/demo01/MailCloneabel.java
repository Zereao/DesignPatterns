package com.zereao.prototype.demo01;

/**
 * @author Zereao
 * @version 2018/09/22  0:13
 */
public class MailCloneabel implements Cloneable {
    private String receiver;
    private String subject;
    private String name;
    private String content;
    private String tail;

    public MailCloneabel(AdvTemplate advTemplate) {
        this.content = advTemplate.getAdvContent();
        this.subject = advTemplate.getAdvSubject();
    }

    @Override
    protected MailCloneabel clone() {
        MailCloneabel mail = null;
        try {
            mail = (MailCloneabel) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return mail;
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
