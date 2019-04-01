package top.linco.oo;

/**
 * 定义一个黄鸭子
 * 实现Duck中的方法
 * 定义黄鸭子的叫声和飞行
 */
public class YellowDuck extends Duck {

    public YellowDuck(){
        super();
    }

    @Override
    public void display() {
        System.out.println("黄毛");
    }

    /**
     * 飞行方式
     */
    public void flyPerform(){
        FlyBehavior flyBehavior = new FlyHight();
        flyBehavior.fly();
    }
    /**
     * 叫法
     */
    public void quackPerform(){
        QuackBehavior quackBehavior = new QuackWhisper();
        quackBehavior.quack();
    }
}
