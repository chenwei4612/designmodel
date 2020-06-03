package com.atguigu.factory.simplefactory.pizzastore.pizza;

/**
 * @author ChenWei
 * @create 2020-05-19-11:36
 */
public class CheesePizza extends pizza  {

    @Override
    public void prepare() {
        System.out.println(" 给制作奶酪披萨 准备原材料 ");
    }
}
