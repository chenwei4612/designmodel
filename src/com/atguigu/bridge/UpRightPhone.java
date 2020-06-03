package com.atguigu.bridge;

/**
 * @author ChenWei
 * @create 2020-05-26-17:57
 */
public class UpRightPhone extends Phone {

    //构造器
    public UpRightPhone(Brand brand) {
        super(brand);
    }

    public void open() {
        super.open();
        System.out.println(" 直立样式手机 ");
    }

    public void close() {
        super.close();
        System.out.println(" 直立样式手机 ");
    }

    public void call() {
        super.call();
        System.out.println(" 直立样式手机 ");
    }
}

