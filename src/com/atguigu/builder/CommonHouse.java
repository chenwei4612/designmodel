package com.atguigu.builder;

/**
 * @author ChenWei
 * @create 2020-05-21-12:10
 */
public class CommonHouse extends AbstractHouse {
    @Override
    public void buildBasic() {
        System.out.println("CommonHouse 打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("CommonHouse 砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("CommonHouse 封顶");
    }
}
