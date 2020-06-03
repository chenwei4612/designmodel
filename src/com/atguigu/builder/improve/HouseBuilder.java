package com.atguigu.builder.improve;

/**
 * @author ChenWei
 * @create 2020-05-22-0:24
 */
//abstract builder
public abstract class HouseBuilder {
    protected House house = new House();
    //将建造的流程写好, 抽象的方法
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();

    //建造房子好， 将产品(房子) 返回
    public House buildHouse(){
        return house;
    }
}
