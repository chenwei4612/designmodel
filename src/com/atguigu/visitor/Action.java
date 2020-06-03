package com.atguigu.visitor;

/**
 * @author ChenWei
 * @create 2020-05-29-12:10
 */
public abstract class Action {

    //得到男性 的测评
    public abstract void getManResult(com.atguigu.visitor.Man man);

    //得到女的 测评
    public abstract void getWomanResult(com.atguigu.visitor.Woman woman);
}
