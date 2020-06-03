package com.atguigu.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ChenWei
 * @create 2020-06-01-12:10
 */
public class Client {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //创建学院
        List<College> collegeList = new ArrayList<College>();

        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();

        collegeList.add(computerCollege);
        //collegeList.add(infoCollege);

        OutPutImpl outPutImpl = new OutPutImpl(collegeList);
        outPutImpl.printCollege();
    }

}
