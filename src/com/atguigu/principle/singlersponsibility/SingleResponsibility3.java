package com.atguigu.principle.singlersponsibility;

/**
 * @author ChenWei
 * @create 2020-04-22-12:11
 */
public class SingleResponsibility3 {
    public static void main(String[] args) {

        Vehile2 vehile2= new Vehile2();
        vehile2.run("aa");
        vehile2.runAir("bb");
        vehile2.runWater("cc");
    }
}
//方式3的分析
//1. 这种修改方法没有对原来的类做大的修改，只是增加方法
//2. 这里虽然没有在类这个级别上遵守单一职责原则，但是在方法级别上，仍然是遵守单一职责
class Vehile2{
    public void run(String vehicle){
        System.out.println(vehicle+" is running.");
    }
    public void runAir(String vehicle){
        System.out.println(vehicle+" is running..");
    }
    public void runWater(String vehicle){
        System.out.println(vehicle+" is running...");
    }
}