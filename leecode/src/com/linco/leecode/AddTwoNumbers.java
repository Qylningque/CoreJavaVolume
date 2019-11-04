package com.linco.leecode;

/**
 * @Classname: addTwoNumbers
 * @description: 2. 两数相加
 * @Author: Create by qingyulin(寧缺) qylningque@outlook.com
 * @Date: 2019-11-04 12:34
 * @Version 1.0
 */

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 示例：
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode results = new ListNode(0);
        ListNode p = l1 , q = l2 , curr = results;
        int curray = 0;
        while(p != null || q != null){
            int x = (p != null)?p.val:0;
            int y = (q != null)?q.val:0;
            int sum = x + y + curray;
            curray = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if(p != null){
                p = p.next;
            }
            if(q != null){
                q = q.next;
            }
        }
        if(curray > 0){
            curr.next = new ListNode(curray);
        }
        return results.next;
    }
}

class ListNode {
     int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
