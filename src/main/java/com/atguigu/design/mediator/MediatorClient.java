package com.atguigu.design.mediator;

/**
 * @Author: McRae.Su
 * @Create: 2021-06-22 20:24
 * @Description:
 */
public class MediatorClient {
    public static void main(String[] args) {
        //创建一个中介者对象
        Mediator mediator = new ConcreteMediator();

        //创建Alarm 并且加入到  ConcreteMediator 对象的HashMap
        Alarm alarm = new Alarm(mediator, "alarm");

        //创建了CoffeeMachine对象，并且加入到ConcreteMediator对象的HashMap
        CoffeeMachine coffeeMachine = new CoffeeMachine(mediator, "coffeeMachine");

        //创建 Curtains , 并且加入到ConcreteMediator 对象的HashMap
        Curtains curtains = new Curtains(mediator, "curtains");

        // 创建TV，并且加入到ConcreteMediator 对象的HashMap
        TV tV = new TV(mediator, "TV");

        //让闹钟发出消息
        alarm.SendAlarm(0);
        coffeeMachine.FinishCoffee();
        alarm.SendAlarm(1);
    }
}
