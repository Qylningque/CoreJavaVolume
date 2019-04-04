package src.top.linco.observer;

/**
 * 观察者模式
 * 观察者接口
 */
public interface Observer {

    /**
     * update方法，主题Subject调用
     * @param temp
     * @param humidity
     * @param pressure
     */
    public void update(float temp,float humidity,float pressure);

}
