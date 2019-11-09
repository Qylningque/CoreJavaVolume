package com.linco.leecode;

/**
 * @Classname: Duplicate
 * @description: 剑指OFFER-数组中重复的数字
 * @Author: Create by qingyulin(寧缺) qylningque@outlook.com
 * @Date: 2019-11-09 21:55
 * @Version 1.0
 */

import java.util.HashMap;
import java.util.Map;

/**
 * 题目描述
 * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。 数组中某些数字是重复的，
 * 但不知道有几个数字是重复的。也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
 * 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
 */
public class Duplicate {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        //1.判断数组是否为空
        if(numbers == null || length <= 0){
            return false;
        }
        //2.遍历数组，将乙遍历过的元素和角标存放到hashMap中，key=>numbers[i],value=>i
        Map<Integer,Integer> curr = new HashMap<>();
        for(int i = 0; i < length; i++){
            if(curr.containsKey(numbers[i])){
                duplication[0] = numbers[i];
                return true;
            }
            curr.put(numbers[i],i);
        }
        return false;
    }
}
