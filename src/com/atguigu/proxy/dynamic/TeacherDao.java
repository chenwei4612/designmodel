package com.atguigu.proxy.dynamic;

/**
 * @author ChenWei
 * @create 2020-05-28-13:35
 */
public class TeacherDao implements ITeacherDao {

    @Override
    public void teach() {
        // TODO Auto-generated method stub
        System.out.println(" 老师授课中.... ");
    }

    @Override
    public void sayHello(String name) {
        // TODO Auto-generated method stub
        System.out.println("hello " + name);
    }

}
