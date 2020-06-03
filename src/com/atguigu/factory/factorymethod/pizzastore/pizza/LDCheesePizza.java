package com.atguigu.factory.factorymethod.pizzastore.pizza;

/**
 * @author ChenWei
 * @create 2020-05-19-17:19
 */
public class LDCheesePizza extends Pizza{

    @Override
    public void prepare() {
        // TODO Auto-generated method stub
        setName("伦敦的奶酪pizza");
        System.out.println(" 伦敦的奶酪pizza 准备原材料");
    }
}