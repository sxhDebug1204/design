package com.atguigu.design.visitor;

/**
 * @Author: McRae.Su
 * @Create: 2021-06-10 20:22
 * @Description:
 */
public abstract class Action {
    /**
     * 获取男性测评
     */
    public abstract void getMenResult(Man man);

    /**
     * 获取女性测评
     */
    public abstract void getWomenResult(Woman woman);
}
