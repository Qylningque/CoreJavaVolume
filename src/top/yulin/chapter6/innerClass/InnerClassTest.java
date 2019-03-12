package top.yulin.chapter6.innerClass;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * 6-7
 * 测试内部类完整程序
 */
public class InnerClassTest {

    public static void main(String[] args) {

        TalkingClock talkingClock = new TalkingClock(1000,true);
        talkingClock.start();
        //控制退出
        JOptionPane.showMessageDialog(null,"退出？");
        System.exit(0);
    }


}

/**
 * 一个定时器
 */
class TalkingClock{

    private int interval;//间隔时间
    private boolean beep;//启动标志

    //构造函数
    public TalkingClock(int aInterval,boolean aBeep){
        this.interval = aInterval;
        this.beep = aBeep;
    }
    //启动定时器
    public void start(){
        //创建监听对象实例
        ActionListener listener = new TimePrinter();
        //创建时钟实例
        Timer timer = new Timer(interval,listener);
        timer.start();
    }

    //时间打印内部类
    public class TimePrinter implements ActionListener{

        public void actionPerformed(ActionEvent event){
            System.out.println("当前时间：" + new Date());
            //停止打印判断
            if(beep){
                Toolkit.getDefaultToolkit().beep();
            }
        }

    }

}
