package src.top.linco.simple_factory;

/**
 * 简单工厂模式
 * 示例：纽约风味披萨
 */
public class ChicagoPizza implements Pizza {
    /**
     * 实现make方法
     */
    @Override
    public void make() {
        System.out.println("Chicago风味Pizza制作中");
    }
    /**
     * 实现send方法
     */
    @Override
    public void send() {
        System.out.println("，配送中");
    }
    /**
     * 实现eat方法
     */
    @Override
    public void eat() {
        System.out.println("，哇塞好好吃！");
    }
}
