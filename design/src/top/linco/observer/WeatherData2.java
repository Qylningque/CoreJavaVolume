package src.top.linco.observer;

import java.util.Observable;

/**
 * 观察者模式2
 * 调用java本身的Observable接口 实现可观察者
 */
public class WeatherData2 extends Observable {
    /**
     * 定义气温变量
     */
    private float temperature;
    /**
     * 定义湿度
     */
    private float humidity;
    /**
     * 定义压力
     */
    private float pressure;

    /**
     * 数据变化时，调用notifyObserver方法通知观察者
     */
    public void measurementsChanged(){
        //调用notifyObservers之前，先调用setChanged来指示状态已经改变
        setChanged();
        //通知观察者
        notifyObservers();
    }
    /**
     * 调用此方法更新数据
     * @param aTemperature
     * @param aHumidity
     * @param aPressure
     */
    public void setMeasurements(float aTemperature,float aHumidity,float aPressure){
        this.temperature = aTemperature;
        this.humidity = aHumidity;
        this.pressure = aPressure;
        //数据更新后，调用measurementsChanged方法进而通知观察者们
        measurementsChanged();
    }
    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
