package com.atguigu.observer.improve;

/**
 * @author ChenWei
 * @create 2020-06-01-17:18
 */
//接口, 让WeatherData 来实现
public interface Subject {

    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}

