package src.top.linco.simple_factory;

/**
 * 简单工厂模式
 * 示例：Pizza接口
 */
public interface Pizza {
    /**
     * 制造
     */
    public void make();
    /**
     * 配送
     */
    public void send();
    /**
     * 食用
     */
    public void eat();

}
