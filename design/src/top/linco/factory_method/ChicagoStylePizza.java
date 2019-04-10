package src.top.linco.factory_method;
/**
 * 工厂方法模式
 * 产品（Product） 具体类
 */
public class ChicagoStylePizza extends Pizza {

    public ChicagoStylePizza(){
        name = "芝加哥风味";
        price = 5.11;
        sauce = "甜酱";
        dough = "厚";
        toppings.add("芝士");
        toppings.add("奶酪");
    }
}
