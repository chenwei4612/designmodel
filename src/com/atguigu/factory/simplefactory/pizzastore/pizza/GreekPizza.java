package com.atguigu.factory.simplefactory.pizzastore.pizza;

/**
 * @author ChenWei
 * @create 2020-05-19-11:39
 */
public class GreekPizza extends pizza {
    @Override
    public void prepare() {
        System.out.println(" 给希腊披萨 准备原材料 ");
    }
}
