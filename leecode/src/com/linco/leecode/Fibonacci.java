package com.linco.leecode;

/**
 * @Classname: Fibonacci
 * @description: 剑指offer-10.1-斐波那契数列
 * @Author: Create by qingyulin(寧缺) qylningque@outlook.com
 * @Date: 2019-11-12 22:37
 * @Version 1.0
 */

/**
 * 题目描述
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 * n<=39
 */
public class Fibonacci {
    //由于待求解的n小于40.因此可以通过动态规划将前40的结果先行计算
    private int[] fib = new int[40];

    public Fibonacci(){
        fib[1] = 1;
        for(int i = 2; i<fib.length;i++){
            fib[i] = fib[i-1] + fib[i-2];
        }
    }

    public int Fibonacci(int n){
        return fib[n];
    }

}
