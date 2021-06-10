package com.atguigu.design.visitor;

/**
 * @Author: McRae.Su
 * @Create: 2021-06-10 20:29
 * @Description:
 */
public class Woman extends Person{
    @Override
    public void accept(Action action) {
        action.getWomenResult(this);
    }
}
