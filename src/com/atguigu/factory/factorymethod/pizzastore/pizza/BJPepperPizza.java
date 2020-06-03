package com.atguigu.factory.factorymethod.pizzastore.pizza;

/**
 * @author ChenWei
 * @create 2020-05-19-17:18
 */
public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        // TODO Auto-generated method stub
        setName("北京的胡椒pizza");
        System.out.println(" 北京的胡椒pizza 准备原材料");
    }
}
