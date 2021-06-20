package com.atguigu.design.observer.traditional;

/**
 * @author SXH
 * @create 2021-06-11 20:39
 * @description: 显示当前天气情况（可以理解成气象站是自己的网站）
 */
public class CurrentConditions {
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
