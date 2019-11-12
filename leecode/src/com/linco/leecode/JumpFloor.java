package com.linco.leecode;

/**
 * @Classname: JumpFloor
 * @description: 剑指offer-10.3-跳台阶
 * @Author: Create by qingyulin(寧缺) qylningque@outlook.com
 * @Date: 2019-11-12 23:10
 * @Version 1.0
 */

/**
 * 题目描述
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 */
public class JumpFloor {

    public int JumpFloor(int target) {
        //解法二，动态规划-复杂度优化O(N)->O(1)
        if(target<=2){
            return target;
        }
        int pre2 = 1,pre1 = 2;
        int result = 0;
        for(int i=3; i<=target; i++){
            result = pre2 + pre1;
            pre2 = pre1;
            pre1 = result;
        }
        return result;
    }

}
