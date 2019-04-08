package src.top.linco.decoration;

/**
 * 装饰者模式测试类
 */
public class DecprationTest {

    public static void main(String[] args) {

        Beverage mocha = new Mocha();
        System.out.println(mocha.getDesc()+"："+mocha.cost());
        Condiment milkForm = new MilkFoam(mocha);
        System.out.println(milkForm.desc+"："+milkForm.cost());
        Condiment chocolate = new Chocolate(milkForm);
        System.out.println(chocolate.getDesc()+"："+chocolate.cost());

    }

}
