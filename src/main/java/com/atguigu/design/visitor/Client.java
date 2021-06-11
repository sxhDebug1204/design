package com.atguigu.design.visitor;

/**
 * @author SXH
 * @create 2021-06-11 20:21
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        //统一访问入口
        ObjectStructure objectStructure = new ObjectStructure();

        //添加人员信息
        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());

        //展示评价成功
        objectStructure.disPlay(new Success());
        //展示评价失败
        objectStructure.disPlay(new Fail());
        //展示评价待定
        objectStructure.disPlay(new Wait());
    }
}
