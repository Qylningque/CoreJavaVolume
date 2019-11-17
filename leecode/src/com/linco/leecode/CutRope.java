package com.linco.leecode;

/**
 * @Classname: CutRope
 * @description: 14.剪绳子-剑指offer
 * @Author: Create by qingyulin(寧缺) qylningque@outlook.com
 * @Date: 2019-11-17 23:19
 * @Version 1.0
 */

/**
 * 题目描述
 * 给你一根长度为n的绳子，请把绳子剪成m段（m、n都是整数，n>1并且m>1），
 * 每段绳子的长度记为k[0],k[1],...,k[m]。请问k[0]xk[1]x...xk[m]可能的最大乘积是多少？
 * 例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
 * 输入描述:
 * 输入一个数n，意义见题面。（2 <= n <= 60）
 * 输出描述:
 * 输出答案。
 * 示例1
 * 输入
 * 复制
 * 8
 * 输出
 * 复制
 * 18
 */
public class CutRope {
    //动态规划
    public int cutRope(int target) {
        int[] n = new int[target + 1];
        n[1] = 1;
        for(int i = 2 ; i<= target; i++){
            for(int j = 1; j < i; j++){
                n[i] = Math.max(n[i],Math.max(j * (i - j),n[j]*(i - j)));
            }
        }
        return n[target];
    }
}
