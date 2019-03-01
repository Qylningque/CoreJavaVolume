package top.yulin.chapter3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 数组排序案例：抽奖活动
 */
public class LotteryDrawing {

    public static void main(String[] args) {

        //实例化Scanner对象
        Scanner scanner = new Scanner(System.in);
        //获取输入的数字，抽几个
        System.out.println("你想抽几个？（输入整数）");
        int k = scanner.nextInt();
        //获取奖池最大数字
        System.out.println("从1开始，最大到多少？（输入整数）");
        int n = scanner.nextInt();
        //定义奖池数组
        int[] numbers = new int[n];
        for (int i = 0 ; i < numbers.length; i++){
            numbers[i] = i + 1;
        }
        //定义获奖数组
        int[] result = new int[k];
        //抽奖过程
        for (int i = 0;i < result.length; i++){
            //通过随机数获取奖池中一个数字并放入中奖数组中
            int r = (int)(Math.random() * n);
            result[i] = numbers[r];
            //将奖池中已中奖数字剔除
            numbers[r] = numbers[n - 1];
            n--;
        }
        //对中奖数字进行排序
        Arrays.sort(result);
        //在控制台打印中奖名单
        System.out.print("中奖名单为");
        for (int element:result) {
            System.out.print(","+element);
        }

    }

}
