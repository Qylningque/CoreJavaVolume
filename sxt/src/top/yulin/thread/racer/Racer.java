package src.top.yulin.thread.racer;

/**
 * 模拟龟兔赛跑
 */
public class Racer implements Runnable{

    private String winner = null;//创建一个winner变量用于接收winner名字

    @Override
    public void run() {
            for (int steps = 1;steps < 101 ; steps++){
                if (Thread.currentThread().getName().equals("rabbit")&& steps%10 == 0){//兔子休息
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+"-->"+steps);
                boolean flag = gameOver(steps);
                if (flag){
                    break;
                }
            }
    }

    //判断是否产生胜利者
    public boolean gameOver(int steps){
        if (null != winner){
            return true;
        }else {
            if (steps == 100){
                winner = Thread.currentThread().getName();
                System.out.println("winner-->"+winner);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Racer racer = new Racer();
        new Thread(racer,"tortoise").start();
        new Thread(racer,"rabbit").start();
    }
}
