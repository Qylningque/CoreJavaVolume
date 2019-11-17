package com.linco.leecode;

/**
 * @Classname: NumberOf1
 * @description: 15.二进制中1的个数-剑指offer
 * @Author: Create by qingyulin(寧缺) qylningque@outlook.com
 * @Date: 2019-11-17 23:33
 * @Version 1.0
 */

/**
 * 题目描述
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 */
public class NumberOf1 {
    public int NumberOf1(int n) {
        // n&(n-1)该位与运算去除n的位级表示中最低的那一位
        int count = 0;
        while(n != 0){
            count++;
            n &= (n-1);
        }
        return count;
        //Integer.bitCount();
        //return Integer.bitCount(n);
    }
}
