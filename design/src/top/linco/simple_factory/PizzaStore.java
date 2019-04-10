package src.top.linco.simple_factory;

/**
 * 简单工厂模式
 * 示例：披萨店
 */
public class PizzaStore {
    PizzaFactory pizzaFactory;

    public PizzaStore(PizzaFactory aPizzaFactory){
        this.pizzaFactory = aPizzaFactory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza = pizzaFactory.createPizza(type);
        if (pizza != null){
            pizza.make();
            pizza.send();
            pizza.eat();
            return pizza;
        }
        return null;
    }

}
