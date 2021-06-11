package com.atguigu.design.visitor;

/**
 * @author SXH
 * @create 2021-06-11 20:08
 * @description:
 */
public class Success extends Action{
    @Override
    public void getMenResult(Man man) {
        System.out.println("男人给的评价该歌手很成功");
    }

    @Override
    public void getWomenResult(Woman woman) {
        System.out.println(" 女人给的评价该歌手很成功 !");
    }
}
