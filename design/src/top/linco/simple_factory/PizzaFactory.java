package src.top.linco.simple_factory;

/**
 * 简单工厂模式
 * 示例：pizza工厂
 */
public class PizzaFactory {
    /**
     * 根据类型制造与之对应的披萨
     * @param type
     * @return
     */
    public Pizza createPizza(String type){
        Pizza pizza = null;
        if (type!=null){
            if (type.equals("ny")){
                pizza = new NewYorkPizza();
            }else if(type.equals("ch")){
                pizza = new ChicagoPizza();
            }else {
                return null;
            }
            return pizza;
        }else {
            return null;
        }
    }

}
