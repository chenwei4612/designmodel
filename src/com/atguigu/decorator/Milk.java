package com.atguigu.decorator;

/**
 * @author ChenWei
 * @create 2020-05-26-23:10
 */
public class Milk extends Decorator {

    public Milk(Drink obj) {
        super(obj);
        // TODO Auto-generated constructor stub
        setDes(" 牛奶 ");
        setPrice(2.0f);
    }

}
