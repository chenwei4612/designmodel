package com.atguigu.visitor;

/**
 * @author ChenWei
 * @create 2020-05-29-12:11
 */
public class Man extends Person {

    @Override
    public void accept(Action action) {
        // TODO Auto-generated method stub
        action.getManResult(this);
    }

}
