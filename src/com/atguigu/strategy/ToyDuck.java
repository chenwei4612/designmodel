package com.atguigu.strategy;

/**
 * @author ChenWei
 * @create 2020-06-03-16:32
 */
public class ToyDuck extends Duck{

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("玩具鸭");
    }

    //需要重写父类的所有方法

    public void quack() {
        System.out.println("玩具鸭不能叫~~");
    }

    public void swim() {
        System.out.println("玩具鸭不会游泳~~");
    }

    public void fly() {
        System.out.println("玩具鸭不会飞翔~~~");
    }
}

