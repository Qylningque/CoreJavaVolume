package src.top.linco.factory_method;

/**
 * 工厂方法测试
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        PizzaStore nyStroe = new NewYorkPizzaStore();
        Pizza nyStylePizza = nyStroe.orderPizza("NewYorkStyle");
        Pizza nyHotPizza = nyStroe.orderPizza("NewYorkHot");

        PizzaStore chStroe = new ChicagoPizzaStore();
        Pizza chStylePizza = chStroe.orderPizza("ChicagoStyle");
        Pizza chHotPizza = chStroe.orderPizza("ChicagoHot");
    }

}
