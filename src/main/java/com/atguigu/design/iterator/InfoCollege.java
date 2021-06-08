package com.atguigu.design.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: McRae.Su
 * @Create: 2021-06-08 20:08
 * @Description:
 */
public class InfoCollege implements College{

    List<Department> departmentList;


    public InfoCollege() {
        departmentList = new ArrayList<Department>();
        addDepartment("信息安全专业", " 信息安全专业 ");
        addDepartment("网络安全专业", " 网络安全专业 ");
        addDepartment("服务器安全专业", " 服务器安全专业 ");
    }

    @Override
    public String getName() {
        return "信息工程学院";
    }

    @Override
    public void addDepartment(String name, String desc) {

        Department department = new Department(name, desc);
        departmentList.add(department);
    }

    @Override
    public Iterator createIterator() {
        return new InfoColleageIterator(departmentList);
    }
}
