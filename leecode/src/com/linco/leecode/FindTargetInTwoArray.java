package com.linco.leecode;

/**
 * @Classname: FindTargetInTwoArray
 * @description: 剑指offer-二维数组中的查找
 * @Author: Create by qingyulin(寧缺) qylningque@outlook.com
 * @Date: 2019-11-09 22:25
 * @Version 1.0
 */

/**
 * 题目描述
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，
 * 输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * [
 *  [1, 4, 7, 11,15]
 *  [2, 5, 8, 12,16]
 *  [3, 6, 9, 13,17]
 *  [18,21,23,26,30]
 * ]
 */
public class FindTargetInTwoArray {
    public boolean Find(int target, int [][] array) {
        //1.首先判断数组是否为空
        if(array == null || array.length <= 0 || array[0].length <= 0){
            return false;
        }
        //2.获取传入二维数组的行数rows与列数cols
        int rows = array.length , cols = array[0].length;
        //3.从数组右上角开始比较
        int r = 0 , c = cols - 1;
        while(r <= rows - 1 && c >= 0){
            if(target == array[r][c]){
                return true;
            }else if(target > array[r][c]){//数值大于当前数组元素时，往下走 r+1
                r++;
            }else{//数值小于当前数组元素时，往左走 c - 1
                c--;
            }
        }
        return false;
    }
}
