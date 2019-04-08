package src.top.linco.decoration;

/**
 * 装饰者模式
 * 被装饰者 实现类
 * 饮料 ：摩卡咖啡
 */
public class Mocha extends Beverage{
    /**
     * 构造函数，赋值给desc变量
     */
    public Mocha(){
        desc = "摩卡咖啡";
    }
    /**
     * 实现cost方法
     * @return
     */
    @Override
    public double cost() {
        return 30.12;
    }
}
