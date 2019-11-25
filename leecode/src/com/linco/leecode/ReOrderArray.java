package com.linco.leecode;

/**
 * @Classname: ReOrderArray
 * @description: 20-调整数组顺序使奇数位于偶数前面-剑指offer
 * @Author: Create by qingyulin(寧缺) qylningque@outlook.com
 * @Date: 2019-11-25 11:30
 * @Version 1.0
 *
 * 题目描述
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * 1,2,3,4,5
 *    |
 * 1,3,5,2,4
 */
public class ReOrderArray {

    public void reOrderArray(int [] array) {
        if(array.length < 0)
            throw new RuntimeException();
        //创建一个新数组
        int oddCount = 0;
        for(int x : array){
            if(!isEven(x))
                oddCount++;
        }
        int[] result = array.clone();
        int i = 0, j = oddCount;
        for(int x : result){
            if(x % 2 == 1)
                result[i++] = x;
            else
                result[j++] = x;
        }
    }

    private boolean isEven(int x){
        return x % 2 == 0;
    }
}
