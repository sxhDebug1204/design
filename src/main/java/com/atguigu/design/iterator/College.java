package com.atguigu.design.iterator;

import java.util.Iterator;

/**
 * @Author: McRae.Su
 * @Create: 2021-06-08 19:52
 * @Description:
 */
public interface College {

     String getName();

    /**
     * 增加学术系的方法
     * @param name 学术系名称
     * @param desc 学术系的描述
     */
     void addDepartment(String name,String desc);

    /**
     * 增加系的方法
     * @return Iterator
     */
    Iterator createIterator();
}
