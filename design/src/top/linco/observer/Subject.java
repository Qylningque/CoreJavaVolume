package src.top.linco.observer;

/**
 * Observer观察者模式
 * 主题接口
 */
public interface Subject {

    /**
     * 注册观察者
     * @param o
     */
    public void registerObserver(Observer o);

    /**
     * 移除观察者
     * @param o
     */
    public void removeObserver(Observer o);

    /**
     * 通知观察者
     */
    public void notifyObserver();

}
