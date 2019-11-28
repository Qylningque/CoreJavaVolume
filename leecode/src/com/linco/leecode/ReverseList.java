package com.linco.leecode;

/**
 * @Classname: ReverseList
 * @description: 24.反转链表-剑指offer
 * @Author: Create by qingyulin(寧缺) qylningque@outlook.com
 * @Date: 2019-11-28 14:55
 * @Version 1.0
 *
 * 题目描述
 * 输入一个链表，反转链表后，输出新链表的表头。
 */
public class ReverseList {

    public ListNode ReverseList(ListNode head) {
        //迭代：使用头插法
        ListNode newList = new ListNode(-1);
        while(head != null){
            ListNode next = head.next;
            head.next = newList.next;
            newList.next = head;
            head = next;
        }
        return newList.next;
    }
}
