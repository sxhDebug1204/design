package com.atguigu.design.mediator;

public class TV extends Colleague {

	public TV(Mediator mediator, String name) {
		super(mediator, name);
		mediator.Register(name, this);
	}

	@Override
	public void sendMessage(int stateChange) {

		this.getMediator().GetMessage(stateChange, this.name);
	}

	public void StartTv() {

		System.out.println("It's time to StartTv!");
	}

	public void StopTv() {

		System.out.println("StopTv!");
	}
}
