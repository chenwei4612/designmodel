package com.atguigu.principle.inversion.improve;

/**
 * @author ChenWei
 * @create 2020-04-22-21:20
 */
public class DependecyInversion {
    public static void main(String[] args) {

        //客户端无需改变
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeiXin());
    }
}

//定义接口
interface IReceiver {
    public String getInfo();
}

//增加微信
class WeiXin implements IReceiver {
    public String getInfo() {
        return "weixin-information: hello,ok.";
    }
}

class Email implements  IReceiver{
    public String getInfo(){
        return "email-information: helloworld!";
    }
}
    //方式2
class Person{
    public  void receive(IReceiver receiver){
        System.out.println(receiver.getInfo());
    }
}
