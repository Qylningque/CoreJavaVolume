package top.yulin.chapter4;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * 本月日历打印
 */
public class CalendarTest {

    public static void main(String[] args) {
        //构造日历对象，并用当前时间和日期进行初始化
        LocalDate date = LocalDate.now();
        //获得当前的月和日
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();
        //将date设置为本月的第一天，并得到今天为星期几
        date = date.minusDays(today - 1);
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        //利用for循环缩进日历第一行
        for (int i = 1;i<value;i++){
            System.out.print("    ");
        }
        //打印日历主体，for循环本月每一天
        while (date.getMonthValue() == month){//while条件限定只打印本月
            System.out.printf("%3d",date.getDayOfMonth());
            if (date.getDayOfMonth() == today){//给当天日期加*
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
            date = date.plusDays(1);//日期+1
            if (date.getDayOfWeek().getValue() == 1){//每个星期开始换行
                System.out.println();
            }
        }
        if (date.getDayOfWeek().getValue() != 1){//每个星期开始换行
            System.out.println();
        }
    }

}
