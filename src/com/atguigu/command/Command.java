package com.atguigu.command;

/**
 * @author ChenWei
 * @create 2020-05-28-21:30
 */
//创建命令接口
public interface Command {

    //执行动作(操作)
    public void execute();
    //撤销动作(操作)
    public void undo();
}
