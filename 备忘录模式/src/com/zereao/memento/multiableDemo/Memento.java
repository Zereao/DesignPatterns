package com.zereao.memento.multiableDemo;

import java.util.Map;

/**
 * 备忘录角色
 *
 * @author Zereao
 * @version 2018/10/05  22:34
 */
public class Memento {
    // 接收HashMap存储状态
    private Map<String, Object> stateMap;

    public Memento(Map<String, Object> stateMap) {
        this.stateMap = stateMap;
    }

    public Map<String, Object> getStateMap() {
        return stateMap;
    }

    public void setStateMap(Map<String, Object> stateMap) {
        this.stateMap = stateMap;
    }
}
