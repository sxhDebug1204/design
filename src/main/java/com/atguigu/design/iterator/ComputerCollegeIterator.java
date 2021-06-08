package com.atguigu.design.iterator;

import java.util.Iterator;

/**
 * @Author: McRae.Su
 * @Create: 2021-06-08 20:00
 * @Description:
 */
public class ComputerCollegeIterator implements Iterator {

    //这里需要Department 是以怎样的方式存放=>数组
    Department[] departments;
    int position = 0; //遍历的位置

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (position >= departments.length || departments[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position += 1;
        return department;
    }

    //删除的方法， 默认空实现
    public void remove() {
    }

}
