package src.top.linco.observer;

/**
 * 测试观察者模式
 */
public class WeatherStationTest {

    public static void main(String[] args) {
        //观察者模式1
        //创建WeatherData对象
        WeatherData weatherData = new WeatherData();
        //创建观察者CurrentConditionsDisplay对象
        CurrentConditionsDisplay c = new CurrentConditionsDisplay(weatherData);
        //改变WeatherData中的数据，测试观察者是否被通知
        weatherData.setMeasurements(99,22,33.33f);

        //观察者模式2
        WeatherData2 weatherData2 = new WeatherData2();
        CurrentConditionsDisplay2 c2 = new CurrentConditionsDisplay2(weatherData2);
        weatherData2.setMeasurements(99,88,77.77f);
    }

}
