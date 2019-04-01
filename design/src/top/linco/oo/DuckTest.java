package top.linco.oo;

/**
 * 测试方法
 */
public class DuckTest {

    public static void main(String[] args) {
        Duck duck = new YellowDuck();
        duck.flyPerform();
        duck.quackPerform();
        duck.display();
    }

}
