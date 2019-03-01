package top.yulin.chapter3;

import java.util.Scanner;

/**
 * Rrtirement Test2
 */
public class Retirement2 {

    public static void main(String[] args) {

        //read inputs
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much money will you contribute everyear ?");
        double payment = scanner.nextDouble();//每年存入
        System.out.println("Interset rate in %:");
        double intersetRate = scanner.nextDouble();//利率
        double balance = 0 ;//账户余额，用于存储临时金额与期望金额进行比较
        int years = 0 ;//预计退休需要年份
        String input = null ;
        //check is goal reached
        do{
            //将今年存入金额根据利率添加到账户余额
            balance += payment;
            double inteset = balance * intersetRate / 100 ;//利息
            balance += inteset;
            years++;
            System.out.println(years+","+balance);
            System.out.println("Do your retire dream come true ?(Y/N):");
            input = scanner.next();
        }while (input.equals("N"));
        System.out.println("Awasome!");
    }
}
