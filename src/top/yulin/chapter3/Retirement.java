package top.yulin.chapter3;

import java.util.Scanner;

/**
 * Rrtirement Test
 */
public class Retirement {

    public static void main(String[] args) {

        //read inputs
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much money do you need when you retire?");
        double goal = scanner.nextDouble();//期望金额
        System.out.println("How much money will you contribute everyear ?");
        double payment = scanner.nextDouble();//每年存入
        System.out.println("Interset rate in %:");
        double intersetRate = scanner.nextDouble();//利率
        double balance = 0 ;//账户余额，用于存储临时金额与期望金额进行比较
        int years = 0 ;//预计退休需要年份
        //check is goal reached
        while (balance < goal){
            //将今年存入金额根据利率添加到账户余额
            balance += payment;
            double inteset = balance * intersetRate / 100 ;//利息
            balance += inteset;
            years++;
        }
        System.out.println("Need " + years +"years you can retire");
    }
}
