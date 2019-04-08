package src.top.linco.decoration;

/**
 * 装饰者模式
 * 被装饰者 基类
 * 饮料
 */
public abstract class Beverage {
    /**
     * 描述
     */
    String desc = "Unknown Beverage";

    /**
     * 对外接口，获得描述
     * @return
     */
    public String getDesc(){
        return desc;
    }

    /**
     * 抽象方法，价格
     * @return
     */
    public abstract double cost();
}
