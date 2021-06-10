package com.atguigu.design.visitor;

/**
 * @Author: McRae.Su
 * @Create: 2021-06-10 20:24
 * @Description:
 */
public abstract class Person {
    private String name;
    private String sex;

    public abstract void accept(Action action);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
