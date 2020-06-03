package com.atguigu.command;

/**
 * @author ChenWei
 * @create 2020-05-28-21:34
 */
public class LightOnCommand implements Command {

    //聚合LightReceiver

    com.atguigu.command.LightReceiver light;

    //构造器
    public LightOnCommand(com.atguigu.command.LightReceiver light) {
        super();
        this.light = light;
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        //调用接收者的方法
        light.on();
    }



    @Override
    public void undo() {
        // TODO Auto-generated method stub
        //调用接收者的方法
        light.off();
    }

}