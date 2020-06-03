package com.atguigu.mediator.smarthouse;

/**
 * @author ChenWei
 * @create 2020-06-01-23:02
 */
public class ClientTest {

    public static void main(String[] args) {
        //创建一个中介者对象
        com.atguigu.mediator.smarthouse.Mediator mediator = new com.atguigu.mediator.smarthouse.ConcreteMediator();

        //创建Alarm 并且加入到  ConcreteMediator 对象的HashMap
        Alarm alarm = new Alarm(mediator, "alarm");

        //创建了CoffeeMachine 对象，并  且加入到  ConcreteMediator 对象的HashMap
        com.atguigu.mediator.smarthouse.CoffeeMachine coffeeMachine = new com.atguigu.mediator.smarthouse.CoffeeMachine(mediator,
                "coffeeMachine");

        //创建 Curtains , 并  且加入到  ConcreteMediator 对象的HashMap
        com.atguigu.mediator.smarthouse.Curtains curtains = new com.atguigu.mediator.smarthouse.Curtains(mediator, "curtains");
        com.atguigu.mediator.smarthouse.TV tV = new com.atguigu.mediator.smarthouse.TV(mediator, "TV");

        //让闹钟发出消息
        alarm.SendAlarm(0);
        coffeeMachine.FinishCoffee();
        alarm.SendAlarm(1);
    }

}
