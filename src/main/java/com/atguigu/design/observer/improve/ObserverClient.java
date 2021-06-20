package com.atguigu.design.observer.improve;

/**
 * @Author: McRae.Su
 * @CreateTime: 2021-06-20 15:05
 * @Description:
 */
public class ObserverClient {

    public static void main(String[] args) {

        // 1、创建一个观察者
        WeatherData weatherData = new WeatherData();

        // 2、创建观察者
        CurrentConditions currentConditions = new CurrentConditions();

        // 3、注册到weatherData
        weatherData.registerObserver(currentConditions);

        weatherData.setData(10f,100f,30.3f);
    }
}
