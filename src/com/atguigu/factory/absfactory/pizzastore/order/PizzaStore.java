package com.atguigu.factory.absfactory.pizzastore.order;

/**
 * @author ChenWei
 * @create 2020-05-19-22:32
 */
public class PizzaStore {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //new OrderPizza(new BJFactory());
        new OrderPizza(new LDFactory());
    }

}
