package com.zereao.memento.multiableDemo;


import java.util.HashMap;
import java.util.Map;

/**
 * 多备份的备忘录管理员
 *
 * @author Zereao
 * @version 2018/10/04  21:18
 */
public class CaretakerMulti {
    /**
     * 容纳备忘录的容器
     * 这里要注意内存溢出问题，该备份一旦产生就装入内存，没有任何销毁的意向，这是非常危险的。
     * 在系统设计时，要严格限定备忘录的创建，建议增加Map的上限，否则系统很容易出现内存溢出的情况
     */
    private Map<String, Memento> memMap = new HashMap<>(16);

    public Memento getMemMap(String idx) {
        return memMap.get(idx);
    }

    public void setMemMap(String idx, Memento memento) {
        this.memMap.put(idx, memento);
    }
}
