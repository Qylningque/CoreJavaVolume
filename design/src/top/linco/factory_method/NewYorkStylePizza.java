package src.top.linco.factory_method;
/**
 * 工厂方法模式
 * 产品（Product） 具体类
 */
public class NewYorkStylePizza extends Pizza {

    public NewYorkStylePizza(){
        name = "纽约风味";
        price = 1.11;
        sauce = "甜酱";
        dough = "薄饼";
        toppings.add("芝士");
        toppings.add("奶酪");
    }
}
