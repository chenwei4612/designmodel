package com.atguigu.mediator.smarthouse;

/**
 * @author ChenWei
 * @create 2020-06-01-23:06
 */
public class CoffeeMachine extends Colleague {

    public CoffeeMachine(com.atguigu.mediator.smarthouse.Mediator mediator, String name) {
        super(mediator, name);
        // TODO Auto-generated constructor stub
        mediator.Register(name, this);
    }

    @Override
    public void SendMessage(int stateChange) {
        // TODO Auto-generated method stub
        this.GetMediator().GetMessage(stateChange, this.name);
    }

    public void StartCoffee() {
        System.out.println("It's time to startcoffee!");
    }

    public void FinishCoffee() {

        System.out.println("After 5 minutes!");
        System.out.println("Coffee is ok!");
        SendMessage(0);
    }
}

