package com.zereao.memento.demo01.clone_able;

import com.zereao.memento.demo01.Boy;

/**
 * @author Zereao
 * @version 2018/10/04  21:42
 */
public class BoyCloneable implements Cloneable {
    private BoyCloneable backup;

    private String state = null;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void createMemento() {
        this.backup = this.clone();
    }

    public void restoreMemento() {
        // 在恢复之前应该进行断言，防止空指针
        this.setState(this.backup.getState());
    }

    @Override
    protected BoyCloneable clone() {
        try {
            return (BoyCloneable) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
