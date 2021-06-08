package com.atguigu.design.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @Author: McRae.Su
 * @Create: 2021-06-08 20:07
 * @Description:
 */
public class InfoColleageIterator implements Iterator {

    List<Department> departmentList; // 信息工程学院是以 List 方式存放系
    int index = -1;//索引

    public InfoColleageIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public boolean hasNext() {
        if (index >= departmentList.size() - 1) {
            return false;
        } else {
            index += 1;
            return true;
        }
    }

    @Override
    public Object next() {
        return departmentList.get(index);
    }

    //空实现 remove
    public void remove() {
    }
}
