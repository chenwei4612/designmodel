package com.atguigu.strategy.improve;

/**
 * @author ChenWei
 * @create 2020-06-03-16:51
 */
public class WildDuck extends Duck {


    //构造器，传入FlyBehavor 的对象
    public  WildDuck() {
        // TODO Auto-generated constructor stub
        flyBehavior = new GoodFlyBehavior();
    }


    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println(" 这是野鸭 ");
    }

}
