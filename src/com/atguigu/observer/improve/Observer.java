package com.atguigu.observer.improve;

/**
 * @author ChenWei
 * @create 2020-06-01-17:08
 */
//观察者接口，有观察者来实现
public interface Observer {

    public void update(float temperature, float pressure, float humidity);
}

