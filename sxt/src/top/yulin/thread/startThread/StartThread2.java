package src.top.yulin.thread.startThread;

/**
 * 创建线程方式二
 * 1.创建：实现Runnable + 重写run
 * 2.启动：创建实现类对象+Thread对象+start
 *
 * 推荐：避免单继承的局限性，优先使用接口，方便共享资源
 */
public class StartThread2 implements Runnable{

    //实现run方法
    @Override
    public void run() {
        for (int i = 0 ; i < 100 ; i++){
            System.out.println("听歌");
        }
    }

    public static void main(String[] args) {
        //创建StartThread2类对象，创建Thread对象，调用start方法
        //StartThread2 startThread2 = new StartThread2();
        //Thread thread = new Thread(startThread2);
        //thread.start();
        //在只使用变量一次的情况下，建议用匿名变量
        new Thread(new StartThread2()).start();
        //测试线程
        for(int i = 0 ; i < 100 ; i++){
            System.out.println("coding");
        }

    }
}
