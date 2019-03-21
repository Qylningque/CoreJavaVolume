package src.top.yulin.thread.startThread;

import java.util.concurrent.Callable;

/**
 * 创建线程方式3
 * 1.创建：实现Callable + 重写call方法
 * 2.启动：
 *      2.1 创建目标对象
 *      2.2 创建执行服务
 *      2.3 提交执行
 *      2.4 获取结果
 *      2.5 关闭服务
 */
public class StartThread3 implements Callable<boolean>{

    //实现call方法
    @Override
    public boolean call() {
        for (int i = 0 ; i < 10 ; i++){
            System.out.println("听歌");
        }
        return false;
    }

    public static void main(String[] args) {

        //创建目标对象
        StartThread3 startThread3 = new StartThread3();
        /*//创建执行服务
        ExecutorService ser = Executor.newFixedThreadPool(3);
        //提交执行
        Future<boolean> results1 = ser.submit(startThread3);
        Future<boolean> results2 = ser.submit(startThread3);
        Future<boolean> results3 = ser.submit(startThread3);
        //获取执行结果
        boolean r1 = results1.get();
        boolean r2 = results2.get();
        boolean r3 = results3.get();
        //关闭服务
        ser.shutdownNow();*/
        for(int i = 0 ; i < 100 ; i++){
            System.out.println("coding");
        }

    }
}
