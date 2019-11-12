package com.linco.leecode;

/**
 * @Classname: RectCover
 * @description: 剑指offer-10.2-矩形覆盖
 * @Author: Create by qingyulin(寧缺) qylningque@outlook.com
 * @Date: 2019-11-12 23:05
 * @Version 1.0
 */

/**
 * 题目描述
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 */
public class RectCover {
    public int RectCover(int target) {
        /**
         //解法一:动态规划，复杂度O(N)
         if(target<=2){
         return target;
         }
         int[] result = new int[target+1];
         result[1] = 1;
         result[2] = 2;
         for(int i = 3;i<=target;i++){
         result[i] = result[i-1] + result[i-2];
         }
         return result[target];
         **/
        //解法二，动态规划，第i项只与i-1和i-2有关，因此只需存储前两项的值就能求解第n项，复杂度O(1)
        if(target<=2){
            return target;
        }
        int pre2 = 1,pre1 = 2;
        int result = 0;
        for(int i = 3; i<=target;i++){
            result = pre2 + pre1;
            pre2 = pre1;
            pre1 = result;
        }
        return result;
    }
}
