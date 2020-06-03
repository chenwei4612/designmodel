package com.atguigu.strategy.improve;

/**
 * @author ChenWei
 * @create 2020-06-03-16:48
 */
public class NoFlyBehavior implements FlyBehavior{

    @Override
    public void fly() {
        // TODO Auto-generated method stub
        System.out.println(" 不会飞翔  ");
    }

}

