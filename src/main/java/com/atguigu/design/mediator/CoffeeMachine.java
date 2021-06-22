package com.atguigu.design.mediator;

/**
 * @Author: McRae.Su
 * @Create: 2021-06-22 20:01
 * @Description: 咖啡机
 */
public class CoffeeMachine extends Colleague{

    public CoffeeMachine(Mediator mediator, String name) {
        super(mediator, name);
        mediator.Register(name,this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().GetMessage(stateChange,this.name);
    }

    public void FinishCoffee(){
        System.out.println("After 5 minutes!");
        System.out.println("Coffee is ok!");
        sendMessage(0);
    }
}
