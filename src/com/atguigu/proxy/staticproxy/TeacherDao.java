package com.atguigu.proxy.staticproxy;

/**
 * @author ChenWei
 * @create 2020-05-28-12:19
 */
public class TeacherDao implements ITeacherDao {

    @Override
    public void teach() {
        // TODO Auto-generated method stub
        System.out.println(" 老师授课中  。。。。。");
    }

}
