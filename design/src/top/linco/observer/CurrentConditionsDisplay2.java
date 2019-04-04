package src.top.linco.observer;

import java.util.Observable;
import java.util.Observer;
/**
 * 观察者模式2
 * 观察者：实时展现数据
 * 继承 java自身的Observer接口和DisplayElement接口
 */
public class CurrentConditionsDisplay2 implements Observer,DisplayElement {
    /**
     * 气温
     */
    private float temperature;
    /**
     * 湿度
     */
    private float humidity;
    /**
     * 压力
     */
    private float pressure;
    /**
     * 可观察者
     * 注册，移除观察者使用
     */
    private Observable observable;
    /**
     * 构造函数 注册观察者
     * @param aObservable
     */
    public CurrentConditionsDisplay2(Observable aObservable){
        this.observable = aObservable;
        aObservable.addObserver(this);
    }

    /**
     * 更新方法，根据主题传过来的数据 对自身数据重新赋值 调用自身的display方法，增加Observable和数据对象作为参数
     * @param obs
     * @param arg
     */
    @Override
    public void update(Observable obs,Object arg) {
        //判断是否是WeatherData2可观察者的通知
        if (obs instanceof WeatherData2){
            WeatherData2 weatherData2 = (WeatherData2) obs;
            this.temperature = weatherData2.getTemperature();
            this.humidity = weatherData2.getHumidity();
            this.pressure = weatherData2.getPressure();
            display();
        }
    }
    /**
     * 具体展示方法
     */
    @Override
    public void display() {
        System.out.println("观察者模式2-->气温："+temperature+",湿度:"+humidity+",压力："+pressure);
    }

}
