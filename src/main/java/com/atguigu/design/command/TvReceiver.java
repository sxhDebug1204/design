package com.atguigu.design.command;

/**
 * @Program:com.atguigu.design.command
 * @Author: mcrae.su
 * @Create: 2021-03-03 17:48
 * @Description: 命令接收者角色
 */
public class TvReceiver {

    public void on(){
        System.out.println("电视开了");
    }

    public void off(){
        System.out.println("电视关了");
    }
}
