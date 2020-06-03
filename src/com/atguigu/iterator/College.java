package com.atguigu.iterator;

import java.util.Iterator;

/**
 * @author ChenWei
 * @create 2020-06-01-11:43
 */
public interface College {

    public String getName();

    //增加系的方法
    public void addDepartment(String name, String desc);

    //返回一个迭代器,遍历
    public Iterator createIterator();
}

