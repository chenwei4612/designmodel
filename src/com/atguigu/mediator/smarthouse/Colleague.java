package com.atguigu.mediator.smarthouse;

/**
 * @author ChenWei
 * @create 2020-06-01-23:00
 */
//同事抽象类
public abstract class Colleague {
    private Mediator mediator;
    public String name;

    public Colleague(Mediator mediator, String name) {

        this.mediator = mediator;
        this.name = name;

    }

    public com.atguigu.mediator.smarthouse.Mediator GetMediator() {
        return this.mediator;
    }

    public abstract void SendMessage(int stateChange);
}

