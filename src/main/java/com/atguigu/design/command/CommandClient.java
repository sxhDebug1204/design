package com.atguigu.design.command;

/**
 * @Program:com.atguigu.design.command
 * @Author: mcrae.su
 * @Create: 2021-03-02 19:55
 * @Description:
 */
public class CommandClient {
    public static void main(String[] args) {

        //完成通过使用遥控器对电灯的操作
        //创建电灯接收者
        LightReceiver lightReceiver = new LightReceiver();

        //创建电灯的开启命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        //需要一个遥控器
        RemoteController remoteController = new RemoteController();
        remoteController.setOnCommands(0,lightOnCommand,lightOffCommand);

        System.out.println("——按下灯的开按钮——");
        remoteController.onButtonWasPushed(0);

        System.out.println("——按下灯的关按钮——");
        remoteController.offButtonWasPushed(0);

        System.out.println("==========使用遥控器来操作电视机============");
        TvReceiver tvReceiver = new TvReceiver();
        TvOnCommand tvOnCommand = new TvOnCommand(tvReceiver);
        TvOffCommand tvOffCommand = new TvOffCommand(tvReceiver);
        remoteController.setOnCommands(1,tvOnCommand,tvOffCommand);

        System.out.println("——按下电视的开机按钮——");
        remoteController.onButtonWasPushed(1);

        System.out.println("——按下电视的关机按钮——");
        remoteController.offButtonWasPushed(1);

        System.out.println("————撤销————");
        remoteController.undoButtonWasPushed();
    }
}
