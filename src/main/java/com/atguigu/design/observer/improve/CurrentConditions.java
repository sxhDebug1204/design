package com.atguigu.design.observer.improve;

/**
 * @Author: McRae.Su
 * @CreateTime: 2021-06-20 14:56
 * @Description:
 */
public class CurrentConditions implements Observer{
    /**
     * 温度
     */
    private float temperature;
    /**
     * 气压
     */
    private float pressure;
    /**
     * 湿度
     */
    private float humidity;

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("***Today mTemperature: " + temperature);
        System.out.println("***Today mPressure: " + pressure);
        System.out.println("***Today mHumidity: " + humidity);
    }
}
