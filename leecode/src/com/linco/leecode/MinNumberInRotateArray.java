package com.linco.leecode;

/**
 * @Classname: MinNumberInRotateArray
 * @description: 11.旋转数组的最小数字-剑指offer
 * @Author: Create by qingyulin(寧缺) qylningque@outlook.com
 * @Date: 2019-11-13 23:50
 * @Version 1.0
 */

/**
 * 题目描述
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */
public class MinNumberInRotateArray {

    public int minNumberInRotateArray(int [] nums) {
        //将旋转数组拆分为两个数组，一个非递减数组，一个旋转数组
        if(nums.length == 0)
            return 0;
        int l = 0, h = nums.length - 1;
        while(l < h){
            int m = l + (h - l) / 2;
            if(nums[m] > nums[h]){
                l = m + 1;
            }else if(nums[m] == nums[h]){//同时考虑到数组中元素重复的情况，对特殊情况进行判断
                h = h-1;
            }else{
                h = m;
            }
        }
        return nums[l];
    }
}
