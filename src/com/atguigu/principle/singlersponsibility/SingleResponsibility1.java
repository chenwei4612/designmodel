package com.atguigu.principle.singlersponsibility;

/**
 * @author ChenWei
 * @create 2020-04-22-11:33
 */
public class SingleResponsibility1 {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.run("aa");
        vehicle.run("bb");
        vehicle.run("cc");
    }
}
//交通工具类
// 方式1
// 1. 在方式1 的run方法中，违反了单一职责原则
// 2. 解决的方案非常的简单，根据交通工具运行方法不同，分解成不同类即可
class Vehicle {
    public void run(String vehicle){
        System.out.println(vehicle+" is running");
    }
}
