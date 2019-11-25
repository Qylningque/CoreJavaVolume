package com.linco.leecode;

/**
 * @Classname: FindKthToTail
 * @description: 22.链表中倒数第K个节点-剑指offer
 * @Author: Create by qingyulin(寧缺) qylningque@outlook.com
 * @Date: 2019-11-25 12:04
 * @Version 1.0
 * 题目描述
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class FindKthToTail {
    public ListNode FindKthToTail(ListNode head,int k) {
        //首先判断连表是否为空
        if(head == null)
            return null;
        //将P1移动到K节点处
        ListNode p1 = head;
        while(p1!=null && k-- > 0)
            p1 = p1.next;
        //判断此时K的大小，如果大于0说明K比链表长度更长
        if(k>0)
            return null;
        //p2和p1共同向前移动
        ListNode p2 = head;
        while(p1 != null){
            p2 = p2.next;
            p1 = p1.next;
        }
        return p2;

    }

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
