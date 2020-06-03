package com.atguigu.adapter.classadapter;

/**
 * @author ChenWei
 * @create 2020-05-25-0:10
 */
public class Client {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(" === 类适配器模式 ====");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }

}

