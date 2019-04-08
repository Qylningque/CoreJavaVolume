package src.top.linco.decoration;
/**
 * 装饰者模式
 * 被装饰者 实现类
 * 饮料 ：拿铁咖啡
 */
public class Latte extends Beverage {
    /**
     * 构造函数，赋值给desc变量
     */
    public Latte(){
        desc = "拿铁咖啡";
    }
    /**
     * 实现cost方法
     * @return
     */
    @Override
    public double cost() {
        return 48.88;
    }
}
