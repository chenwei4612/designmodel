package com.atguigu.mediator.smarthouse;

/**
 * @author ChenWei
 * @create 2020-06-01-23:11
 */
public class Curtains extends Colleague {

    public Curtains(com.atguigu.mediator.smarthouse.Mediator mediator, String name) {
        super(mediator, name);
        // TODO Auto-generated constructor stub
        mediator.Register(name, this);
    }

    @Override
    public void SendMessage(int stateChange) {
        // TODO Auto-generated method stub
        this.GetMediator().GetMessage(stateChange, this.name);
    }

    public void UpCurtains() {
        System.out.println("I am holding Up Curtains!");
    }

}

