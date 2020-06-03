package com.atguigu.template;

/**
 * @author ChenWei
 * @create 2020-05-28-18:08
 */
public class Client {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //制作红豆豆浆

        System.out.println("----制作红豆豆浆----");
        SoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();

        System.out.println("----制作花生豆浆----");
        SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();
    }

}