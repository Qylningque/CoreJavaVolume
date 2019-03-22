package top.yulin.thread.lambda;

public class InterfaceLambdaTest {

    public static void main(String[] args) {

       Drink milk = new Milk();
       milk = (int a,int c)->{
           return a*c;
       };
       System.out.println(milk.price(10,20));

       Drink teaMilk = new Milk();
       teaMilk = (a,c)->{
           System.out.println("a:"+a);
           System.out.println("c:"+c);
           return a+c;
       };
       System.out.println(teaMilk.price(10,20));

    }

}

interface Drink{
    int price(int a,int c);
}

class Milk implements Drink{

    private Integer prices;

    @Override
    public int price(int a,int c) {
        prices = a*c;
        System.out.println("牛奶价格:" + prices);
        return a+c;
    }

}