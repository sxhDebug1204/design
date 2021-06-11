package com.atguigu.design.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * @author SXH
 * @create 2021-06-11 20:04
 * @description:
 */
public class ObjectStructure {

    //维护了一个集合
    private List<Person> personList = new LinkedList<>();

    public void attach(Person p){
        personList.add(p);
    }

    public void detach(Person person){
        personList.remove(person);
    }

    // 显示测评情况
    public void disPlay(Action action){
        for (Person person : personList) {
            person.accept(action);
        }
    }

}
