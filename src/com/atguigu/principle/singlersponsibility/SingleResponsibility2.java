package com.atguigu.principle.singlersponsibility;

/**
 * @author ChenWei
 * @create 2020-04-22-12:11
 */
public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("aa");
        roadVehicle.run("bb");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("cc");
        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("dd");
    }
}
//1. 遵守单一职责原则
//2. 但是这样做的改动很大，即将类分解，同时修改客户端
//3. 改进：直接修改Vehicle 类，改动的代码会比较少=>方案3
class RoadVehicle{
    public void run(String vechicle){
        System.out.println(vechicle+" is runnig.");
    }
}
class AirVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+" is runnig..");
    }
}
class WaterVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+" is runnig...");
    }
}