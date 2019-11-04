package com.linco.leecode;

/**
 * @Classname: LengthOfLongestSubstring
 * @description: 3. 无重复字符的最长子串
 * @Author: Create by qingyulin(寧缺) qylningque@outlook.com
 * @Date: 2019-11-04 12:33
 * @Version 1.0
 */

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 示例 1:
 *
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 *
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 *
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 */
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length() , result = 0; //1.获取字符串长度，定义变量存储返回结果

        Map<Character,Integer> map = new HashMap<>(); //2.定义Map用来存储判断过的字符串

        for(int i = 0,j = 0;j<len;j++){//3.遍历判断字符串中无重复最长子串长度

            if(map.containsKey(s.charAt(j))){//4.当遍历到Map中保存的字符串中存在重复字符串时,

                i = Math.max(map.get(s.charAt(j)),i); //i的值向前跳动到最后判断的无重复字符串处角标

            }

            //5.当前遍历不含有重复字符的子串时，判断当前返回结果与[i,j]区间的长度，返回结果取最大
            result = Math.max(result,j-i+1);
            //6.Map存储当前j遍历到的字符串角标处对应值
            //j+1代表下一次判断如果含有重复字符时，i跳动的值？
            map.put(s.charAt(j),j+1);
        }
        return result;
    }
}
