package src.top.yulin.thread.startThread;

/**
 * 创建线程方式一
 * 1.继承Thread类，实现run方法
 * 2.创建对象，调用start方法
 */
public class StartThread extends Thread{

    //实现run方法
    @Override
    public void run() {
        for (int i = 0 ; i < 100 ; i++){
            System.out.println("听歌");
        }
    }

    public static void main(String[] args) {
        //创建StartThread对象
        StartThread startThread = new StartThread();
        //启动线程
        startThread.start();
        //测试线程
        for(int i = 0 ; i < 100 ; i++){
            System.out.println("coding");
        }

    }
}
