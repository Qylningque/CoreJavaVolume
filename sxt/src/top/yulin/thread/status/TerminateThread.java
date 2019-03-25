package top.yulin.thread.status;

/**
 * 外部通过标识控制线程终止
 */
public class TerminateThread implements Runnable{
    //1.加入标识 标记线程体是否可以运行
    private boolean flag = true;

    private String name;

    @Override
    public void run() {
        int i = 0;
        //2.关联标识 true运行 false停止
        while(flag){
            System.out.println("线程还在跑！！！！-->"+i++);
        }
    }
    //构造方法
    public TerminateThread(String name){
        this.name = name;
    }

    //改变标识方法
    public void changeFlage(){
        this.flag = false;
    }

    public static void main(String[] args) {

        TerminateThread terminateThread = new TerminateThread("梅西");
        new Thread(terminateThread).start();

        for (int i = 0 ; i<500;i++){
            if (i==380){
                terminateThread.changeFlage();
                System.out.println("game over");
            }
            System.out.println(i);
        }

    }
}
