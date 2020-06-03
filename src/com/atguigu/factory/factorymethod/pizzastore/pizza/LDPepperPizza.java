package com.atguigu.factory.factorymethod.pizzastore.pizza;

/**
 * @author ChenWei
 * @create 2020-05-19-17:20
 */
public class LDPepperPizza extends Pizza{
    @Override
    public void prepare() {
        // TODO Auto-generated method stub
        setName("伦敦的胡椒pizza");
        System.out.println(" 伦敦的胡椒pizza 准备原材料");
    }
}
