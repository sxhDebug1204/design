package com.atguigu.design.observer.improve;

/**
 * @Author: McRae.Su
 * @CreateTime: 2021-06-20 14:41
 * @Description:
 */
public interface Subject {
   void registerObserver(Observer observer);
   void removeObserver(Observer observer);
   void notifyObservers();

}
