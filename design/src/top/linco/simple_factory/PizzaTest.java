package src.top.linco.simple_factory;

/**
 * 简单工厂模式
 * 测试
 */
public class PizzaTest {

    public static void main(String[] args) {
        Pizza pizza = new PizzaStore(new PizzaFactory()).orderPizza("ny");
    }

}
