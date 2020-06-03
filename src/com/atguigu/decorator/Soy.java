package com.atguigu.decorator;

/**
 * @author ChenWei
 * @create 2020-05-26-23:17
 */
public class Soy extends Decorator{

    public Soy(Drink obj) {
        super(obj);
        // TODO Auto-generated constructor stub
        setDes(" 豆浆  ");
        setPrice(1.5f);
    }

}