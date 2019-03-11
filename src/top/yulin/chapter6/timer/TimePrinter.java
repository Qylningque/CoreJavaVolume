package top.yulin.chapter6.timer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * 6-3
 * 时间监听，实现ActionListener中actionPerformed()
 */
class TimePrinter implements ActionListener {

    public void actionPerformed(ActionEvent event){
        System.out.println("现在时间是：" + new Date());
        Toolkit.getDefaultToolkit().beep();
    }

}
