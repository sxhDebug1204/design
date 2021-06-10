package com.atguigu.design.visitor;

/**
 * @Author: McRae.Su
 * @Create: 2021-06-10 20:28
 * @Description:
 */
public class Man extends Person{
    @Override
    public void accept(Action action) {
        action.getMenResult(this);
    }
}
