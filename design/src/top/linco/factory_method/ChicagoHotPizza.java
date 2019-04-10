package src.top.linco.factory_method;
/**
 * 工厂方法模式
 * 产品（Product） 具体类
 */
public class ChicagoHotPizza extends Pizza {

    public ChicagoHotPizza(){
        name = "芝加哥辣四方";
        price = 2.11;
        sauce = "辣酱";
        dough = "厚饼";
        toppings.add("小米辣");
        toppings.add("印度魔鬼辣");
    }
}
