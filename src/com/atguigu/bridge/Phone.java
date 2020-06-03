package com.atguigu.bridge;

/**
 * @author ChenWei
 * @create 2020-05-26-17:54
 */
public abstract class Phone {

    //组合品牌
    private Brand brand;

    //构造器
    public Phone(Brand brand) {
        super();
        this.brand = brand;
    }

    protected void open() {
        this.brand.open();
    }
    protected void close() {
        brand.close();
    }
    protected void call() {
        brand.call();
    }

}

