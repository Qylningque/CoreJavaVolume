package src.top.linco.observer;

/**
 * 观察者模式
 * 观察者：实时展现数据
 * 继承 Observer、DisplayElement接口
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement{
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
     * Subject 对象
     * 注册，移除观察者使用
     */
    private Subject subject;

    /**
     * 构造函数 注册观察者
     * @param aSubject
     */
    public CurrentConditionsDisplay(Subject aSubject){
        this.subject = subject;
        aSubject.registerObserver(this);
    }
    /**
     * 更新方法，根据主题传过来的数据 对自身数据重新赋值 调用自身的display方法
     * @param aTemp
     * @param aHumidity
     * @param aPressure
     */
    @Override
    public void update(float aTemp, float aHumidity, float aPressure) {
        this.temperature = aTemp;
        this.humidity = aHumidity;
        this.pressure = aPressure;
        display();
    }
    /**
     * 具体展示方法
     */
    @Override
    public void display() {
        System.out.println("观察者模式1-->气温："+temperature+",湿度:"+humidity+",压力："+pressure);
    }

}
