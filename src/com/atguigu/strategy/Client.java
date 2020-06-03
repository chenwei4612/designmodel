package com.atguigu.strategy;

/**
 * @author ChenWei
 * @create 2020-06-03-16:36
 */
public class Client {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //测试
        PekingDuck pkd = new PekingDuck();
        pkd.display();
        WildDuck wd = new WildDuck();
        wd.display();
        ToyDuck td = new ToyDuck();
        td.display();
    }

}
