package com.atguigu.design.command;

/**
 * @Program:com.atguigu.design.command
 * @Author: mcrae.su
 * @Create: 2021-03-03 17:47
 * @Description:
 */
public class TvOffCommand implements Command{
    //聚合命令接受者TV
    TvReceiver tv;

    public TvOffCommand(TvReceiver tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }
}
