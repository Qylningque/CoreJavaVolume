package src.top.linco.decoration;

/**
 * 装饰者模式
 * 装饰者 基类
 * 调料
 * 继承被装饰者基类
 */
public abstract class Condiment extends Beverage{
    /**
     * 重写getDesc方法
     * @return
     */
    @Override
    public abstract String getDesc();
}
