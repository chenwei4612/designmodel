package com.atguigu.visitor;

/**
 * @author ChenWei
 * @create 2020-05-29-13:16
 */
public class Client {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //创建ObjectStructure
        ObjectStructure objectStructure = new ObjectStructure();

        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());


        //成功
        Success success = new Success();
        objectStructure.display(success);

        System.out.println("===============");
        Fail fail = new Fail();
        objectStructure.display(fail);

        System.out.println("=======给的是待定的测评========");

        com.atguigu.visitor.Wait wait = new com.atguigu.visitor.Wait();
        objectStructure.display(wait);
    }

}
