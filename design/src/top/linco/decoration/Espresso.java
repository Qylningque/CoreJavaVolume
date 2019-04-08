package src.top.linco.decoration;

/**
 * 装饰者模式
 * 被装饰者 实现类
 * 饮料 ：浓缩咖啡
 */
public class Espresso extends Beverage {
    /**
     * 构造函数，赋值给desc变量
     */
    public Espresso(){
        desc = "浓缩咖啡";
    }
    /**
     * 实现cost方法
     * @return
     */
    @Override
    public double cost() {
        return 23.22;
    }
}
