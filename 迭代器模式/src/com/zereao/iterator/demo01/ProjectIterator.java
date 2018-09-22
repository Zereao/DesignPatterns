package com.zereao.iterator.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zereao
 * @version 2018/09/22  0:37
 */
public class ProjectIterator implements IProjectIterator {
    private List<IProject> projectList = new ArrayList<>();
    private int currentItem = 0;

    public ProjectIterator(List<IProject> projectList) {
        this.projectList = projectList;
    }

    @Override
    public boolean hasNext() {
        return !(this.currentItem >= projectList.size() || this.projectList.get(currentItem) == null);
    }

    @Override
    public IProject next() {
        return this.projectList.get(this.currentItem++);
    }

    @Override
    public void remove() {
        // 暂时没有使用到
    }
}
