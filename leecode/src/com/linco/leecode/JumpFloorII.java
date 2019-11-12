package com.linco.leecode;

/**
 * @Classname: JumpFloorII
 * @description: 剑指offer-10.4-变态跳台阶
 * @Author: Create by qingyulin(寧缺) qylningque@outlook.com
 * @Date: 2019-11-12 23:19
 * @Version 1.0
 */

import java.util.Arrays;

/**
 * 题目描述
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class JumpFloorII {

    public int JumpFloorII(int target) {
        //解法一，动态规划
        int[] result = new int[target];
        Arrays.fill(result,1);
        for(int i=1;i<target;i++){
            for(int j=0; j<i; j++){
                result[i] += result[j];
            }
        }
        return result[target - 1];
        //解法二，推导公式，等比数列
        //return (int) Math.pow(2,target - 1);
    }

}
