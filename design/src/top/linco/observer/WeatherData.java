package src.top.linco.observer;

import java.util.ArrayList;

/**
 * 观察者模式
 * 气象站数据
 */
public class WeatherData implements Subject{

    /**
     * 用于存放观察者
     */
    private ArrayList observerList;
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
     * 构造函数
     */
    public WeatherData(){
        observerList = new ArrayList();
    }
    /**
     * 注册观察者
     * 将新观察者存放到观察者的数组中
     * @param o
     */
    @Override
    public void registerObserver(Observer o){
        observerList.add(o);
    }
    /**
     * 移除观察者
     * 从观察者数组中移除
     * @param o
     */
    @Override
    public void removeObserver(Observer o){
        //获得观察者在数组中的角标
        int i = observerList.indexOf(o);
        //当存在此角标时，从数组中移除观察者
        if (i>=0){
            observerList.remove(i);
        }
    }
    /**
     * 通知观察者
     * 逐一调用观察者的update方法
     */
    @Override
    public void notifyObserver(){
        //对观察者数组进行遍历，逐一通知
        for (int i = 0;i<observerList.size();i++){
            //获得一个观察者对象
            Observer observer = (Observer) observerList.get(i);
            //调用观察者中的update方法让其进行更新
            observer.update(temperature,humidity,pressure);
        }
    }
    /**
     * 数据变化时，调用notifyObserver方法通知观察者
     */
    public void measurementsChanged(){
        notifyObserver();
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
}
