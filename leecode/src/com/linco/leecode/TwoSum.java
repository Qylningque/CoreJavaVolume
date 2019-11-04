package com.linco.leecode;

/**
 * @Classname: TwoSum
 * @description: 1. 两数之和
 * @Author: Create by qingyulin(寧缺) qylningque@outlook.com
 * @Date: 2019-11-04 12:35
 * @Version 1.0
 */

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        if(nums == null || nums.length <= 0){
            return result;
        }
        for(int i = 0;i<nums.length;i++){
            for(int j = nums.length - 1;j>i;j--){
                if(nums[i] + nums[j] == target && i != j){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

}
