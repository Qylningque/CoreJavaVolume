package top.yulin.thread.lambda;

/**
 * 线程中使用lambda，避免匿名内部类过多，实质属于函数式编程
 * lambda表达式试用于只有一个方法的接口
 */
public class LambdaTest {

    public static void main(String[] args) {

        //完整Thread中使用lambda表达式
        new Thread(()->{
            System.out.println("学习lambda");
        }).start();

        //简化Thread中使用lambda表达式
        new Thread(()-> System.out.println("简化lambda")).start();

        //lambda表达式中多行代码
        new Thread(()->{
            for (int i = 0 ; i < 10 ; i++){
                System.out.println("多行代码lambda-->"+i);
            }
        }).start();
    }

}
