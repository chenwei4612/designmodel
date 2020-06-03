package com.atguigu.builder;

/**
 * @author ChenWei
 * @create 2020-05-21-11:59
 */
public abstract class AbstractHouse {
    //打地基
    public abstract  void buildBasic();
    //砌墙
    public abstract void buildWalls();
    //封顶
    public abstract void roofed();

    public void build(){
        buildBasic();
        buildWalls();
        roofed();
    }
}
