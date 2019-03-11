package top.yulin.chapter6.lambda;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Date;

/**
 * 6-6
 * lambda表达式，定时打印、数组排序：根据字符串长度
 */
public class LambdaTest {

    public static void main(String[] args) {

        String[] planets = new String[]{"Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune"};
        //打印原始字符串数组
        System.out.println("原始数组：");
        System.out.println(Arrays.toString(planets));
        //数组排序：根据首字母字典排序
        Arrays.sort(planets);
        //打印字典排序后的数组
        System.out.println("字典排序后：");
        System.out.println(Arrays.toString(planets));
        //数组排序，根据字符串长度排序
        Arrays.sort(planets,(first,second) -> first.length() - second.length());
        //打印根据长度排序后的数组
        System.out.println("根据长度排序后：");
        System.out.println(Arrays.toString(planets));

        //::方法引用
/*        Timer t = new Timer(1000,System.out::println);
        t.start();*/

        //定时任务，打印日期
        Timer timer = new Timer(10000,event ->
            {
                System.out.println("当前时间为：" + new Date());
                Toolkit.getDefaultToolkit().beep();//响一声
            });
        timer.start();

        //可视化工具类，提示关闭
        JOptionPane.showMessageDialog(null,"退出？");
        System.exit(0);

    }

}
