package com.zereao.iterator.demo01;

/**
 * @author Zereao
 * @version 2018/09/22  0:27
 */
public interface IProject {
    void add(String name, int num, int cost);

    String getProjectInfo();

    IProjectIterator iterator();
}
