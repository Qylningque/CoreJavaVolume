package top.yulin.chapter6.timer;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * 6-3
 * 定时器和监听器的操作行为
 */
public class TimerTest {

    public static void main(String[] args) {

        ActionListener listener = new TimePrinter();

        Timer timer = new Timer(10000,listener);

        timer.start();

        JOptionPane.showMessageDialog(null,"退出？");
        System.exit(0);

    }

}
