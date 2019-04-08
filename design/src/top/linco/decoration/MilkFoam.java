package src.top.linco.decoration;
/**
 * 装饰者模式
 * 装饰者 实现类
 * 调料 ：奶泡
 */
public class MilkFoam extends Condiment{
    /**
     * Beverage实例变量，记录被装饰者
     */
    Beverage beverage;

    /**
     * 构造函数
     * 将被装饰者（饮料）记录到实例变量中
     * @param aBeverage
     */
    public MilkFoam(Beverage aBeverage){
        this.beverage = aBeverage;
    }

    /**
     * 重写getDesc方法
     * @return
     */
    @Override
    public String getDesc() {
        return this.beverage.getDesc() + ",奶泡";
    }

    /**
     * 重写cost方法
     * @return
     */
    @Override
    public double cost() {
        return this.beverage.cost() + .99;
    }
}
