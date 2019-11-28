package com.linco.leecode;

/**
 * @Classname: EntryNodeOfLoop
 * @description: 23.链表中环的入口-剑指offer
 * @Author: Create by qingyulin(寧缺) qylningque@outlook.com
 * @Date: 2019-11-25 14:22
 * @Version 1.0
 *
 * 题目描述
 * 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
 */
public class EntryNodeOfLoop {

    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if(pHead == null || pHead.next == null)
            return null;
        ListNode slow = pHead , fast = pHead;
        do{
            fast = fast.next.next;
            slow = slow.next;
        }while(fast != slow);
        fast = pHead;
        while(fast != slow){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

}
