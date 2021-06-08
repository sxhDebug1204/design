package com.atguigu.design.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: McRae.Su
 * @Create: 2021-06-08 20:14
 * @Description:
 */
public class IteratorClient {
    public static void main(String[] args) {
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
