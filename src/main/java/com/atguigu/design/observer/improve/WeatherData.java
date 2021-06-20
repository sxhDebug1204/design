package com.atguigu.design.observer.improve;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: McRae.Su
 * @CreateTime: 2021-06-11 20:47
 * @Description: 类是核心
 * 1. 包含最新的天气情况信息
 * 2. 含有 观察者集合，使用List管理
 * 3. 当数据有更新时，就主动的调用CurrentConditions对象update方法(含 display), 这样他们（接入方）就看到最新的信息
 */
public class WeatherData implements Subject{

    private float temperatrue;
    private float pressure;
    private float humidity;
    private List<Observer> observers;

    public WeatherData() {
        this.observers = new ArrayList<Observer>();
    }

    public float getTemperature() {
        return temperatrue;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void dataChange() {
        notifyObservers();
    }

    //当数据有更新时，就调用 setData
    public void setData(float temperature, float pressure, float humidity) {
        this.temperatrue = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        //调用dataChange， 将最新的信息 推送给 接入方 currentConditions
        dataChange();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observers.contains(observer)){
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(this.temperatrue,this.pressure,this.humidity);
        }
    }
}




