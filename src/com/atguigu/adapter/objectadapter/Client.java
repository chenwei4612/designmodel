package com.atguigu.adapter.objectadapter;

/**
 * @author ChenWei
 * @create 2020-05-25-10:55
 */
public class Client {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(" === 对象适配器模式 ====");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }

}
