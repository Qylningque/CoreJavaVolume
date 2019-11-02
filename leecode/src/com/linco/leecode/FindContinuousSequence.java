package com.linco.leecode;

/**
 * @Classname: FindContinuousSequence
 * @description: 和为S的连续正数序列
 * @Author: Create by qingyulin(寧缺) qylningque@outlook.com
 * @Date: 2019-11-02 16:30
 * @Version 1.0
 */

import java.util.ArrayList;

/**
 * 题目描述
 * 小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。但是他并不满足于此,
 * 他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。
 * 现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!
 * 输出描述:
 * 输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
 */
public class FindContinuousSequence {

    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        //存放结果
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        //设定两个起点，相当于是滑动窗口的两边，根据其窗口内的值的和来确定窗口的位置
        int pLow = 1,pHight = 2;
        while(pLow<pHight){
            //由于是连续的，差为1的一个序列，求和公式为（a0+an）*n/2
            int cur = (pLow + pHight) * (pHight - pLow + 1) / 2;
            //相等，则把窗口范围内所有数添加进结果集
            if(cur == sum){
                ArrayList<Integer> list = new ArrayList<>();
                for(int i = pLow;i<=pHight;i++){
                    list.add(i);
                }
                result.add(list);
                pLow++;
                //如果当前窗口范围内的值求和结果小于值，则将右窗口向右移一位
            }else if(cur<sum){
                pHight++;
                //如果当前窗口范围内的值求和结果大于值，则将左窗口向右移一位
            }else{
                pLow++;
            }
        }
        return result;

    }

}
