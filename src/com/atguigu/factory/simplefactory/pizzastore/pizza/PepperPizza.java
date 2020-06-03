package com.atguigu.factory.simplefactory.pizzastore.pizza;

/**
 * @author ChenWei
 * @create 2020-05-19-11:40
 */
public class PepperPizza extends pizza {
    @Override
    public void prepare() {
        System.out.println(" 给胡椒披萨准备原材料 ");
    }
}
