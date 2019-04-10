package src.top.linco.factory_method;


/**
 * 工厂方法模式
 * 创建者（Creator） 抽象类
 * 定义一个抽象的工厂方法，让子类实现此方法制造产品
 */
public abstract class PizzaStore {
    /**
     * 已实现方法
     * @param type
     * @return
     */
    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.make();
        pizza.send();
        pizza.eat();
        return pizza;
    }

    /**
     * 抽象方法 子类因地制宜实现
     * @param type
     * @return
     */
    protected abstract Pizza createPizza(String type);

}
