package com.atguigu.command;

/**
 * @author ChenWei
 * @create 2020-05-28-21:58
 */
public class TVOffCommand implements Command {

    // 聚合TVReceiver

    TVReceiver tv;

    // 构造器
    public TVOffCommand(TVReceiver tv) {
        super();
        this.tv = tv;
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        // 调用接收者的方法
        tv.off();
    }

    @Override
    public void undo() {
        // TODO Auto-generated method stub
        // 调用接收者的方法
        tv.on();
    }
}
