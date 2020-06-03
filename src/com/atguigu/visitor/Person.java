package com.atguigu.visitor;

/**
 * @author ChenWei
 * @create 2020-05-29-12:08
 */
public abstract class Person {

    //提供一个方法，让访问者可以访问
    public abstract void accept(Action action);
}

