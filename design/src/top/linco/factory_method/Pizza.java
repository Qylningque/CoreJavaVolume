package src.top.linco.factory_method;

import java.util.ArrayList;

/**
 * 工厂方法模式
 * 产品类（Product） 抽象类
 */
public abstract class Pizza {

    String name;//名字
    double price;//价格
    String sauce;//酱料
    String dough;//面团
    ArrayList toppings = new ArrayList<String>();//佐料
    /**
     * 装备工作
     */
    void prepare(){
        System.out.println("准备工作进行中...");
        System.out.println("调料添加中：");
        for (int i = 0 ; i<toppings.size();i++){
            System.out.println(" "+toppings.get(i));
        }
    }

    void make(){
        System.out.println(name + "正在制作");
    }
    void send(){
        System.out.println(name + "配送中");
    }
    void eat(){
        System.out.println(name + "真好吃！");
    }
}
