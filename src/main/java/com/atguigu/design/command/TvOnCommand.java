package com.atguigu.design.command;

/**
 * @Program:com.atguigu.design.command
 * @Author: mcrae.su
 * @Create: 2021-03-18 19:56
 * @Description:
 */
public class TvOnCommand implements Command {

    public TvOnCommand(TvReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    TvReceiver tvReceiver;

    @Override
    public void execute() {
        tvReceiver.on();
    }

    @Override
    public void undo() {
        tvReceiver.off();
    }
}
