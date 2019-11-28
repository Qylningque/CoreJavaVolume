package com.linco.leecode;

/**
 * @Classname: Merge
 * @description: 25.合并两个排序的链表-剑指offer
 * @Author: Create by qingyulin(寧缺) qylningque@outlook.com
 * @Date: 2019-11-28 15:48
 * @Version 1.0
 *
 * 题目描述
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */
public class Merge {

    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;
        if(list1.val <= list2.val){
            list1.next = Merge(list1.next,list2);
            return list1;
        }else{
            list2.next = Merge(list1,list2.next);
            return list2;
        }

    }
}
