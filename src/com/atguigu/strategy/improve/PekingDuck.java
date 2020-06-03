package com.atguigu.strategy.improve;

/**
 * @author ChenWei
 * @create 2020-06-03-16:51
 */
public class PekingDuck extends Duck {


    //假如北京鸭可以飞翔，但是飞翔技术一般
    public PekingDuck() {
        // TODO Auto-generated constructor stub
        flyBehavior = new BadFlyBehavior();

    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("~~北京鸭~~~");
    }



}