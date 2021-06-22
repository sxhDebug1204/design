package com.atguigu.design.mediator;

/**
 * @Author: McRae.Su
 * @Create: 2021-06-22 19:55
 * @Description: 具体的同事类 ---》闹钟
 */
public class Alarm extends Colleague{

    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        mediator.Register(name,this);
    }

    public void SendAlarm(int stateChange){
        sendMessage(stateChange);
    }

    @Override
    public void sendMessage(int stateChange) {
        //调用的中介者对象的 getMessage
        this.getMediator().GetMessage(stateChange, this.name);
    }
}
