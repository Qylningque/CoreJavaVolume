package top.linco.oo;

/**
 * 了解OO思想
 * Duck超类
 */
public abstract class Duck {

    //引入FlyBehavior、QuackBehavior接口
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    /**
     * 构造函数
     */
    public Duck(){

    }
    /**
     * 1.抽象外形函数
     */
    public abstract void display();
    /**
     * 2.委托给行为类:flyBehavior
     */
    public void flyPerform(){
        flyBehavior.fly();
    }
    /**
     * 2.委托给行为类:quackBehavior
     */
    public void quackPerform(){
        quackBehavior.quack();
    }
}
