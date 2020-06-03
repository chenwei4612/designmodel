package com.atguigu.memento.theory;

/**
 * @author ChenWei
 * @create 2020-06-02-16:38
 */
public class Memento {
    private String state;

    //构造器
    public Memento(String state) {
        super();
        this.state = state;
    }

    public String getState() {
        return state;
    }



}

