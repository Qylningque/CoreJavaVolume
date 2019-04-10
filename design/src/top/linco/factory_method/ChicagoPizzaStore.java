package src.top.linco.factory_method;


/**
 * 工厂方法模式
 * 创建者（Creator） 具体类
 * 子类实现抽象方法方法制造产品
 */
public class ChicagoPizzaStore extends PizzaStore {


    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("ChicagoStyle")){
            pizza = new ChicagoStylePizza();
        }else if (type.equals("ChicagoHot")){
            pizza = new ChicagoHotPizza();
        }
        return pizza;
    }
}
